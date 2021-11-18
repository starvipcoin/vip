package com.devlomi.fireapp.adapters.messaging.holders

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.core.view.isVisible
import com.bumptech.glide.Glide
import com.devlomi.fireapp.R
import com.devlomi.fireapp.adapters.messaging.holders.base.BaseSentHolder
import com.devlomi.fireapp.model.realms.Message
import com.devlomi.fireapp.model.realms.User

class SentStickerHolder(context: Context, itemView: View) : BaseSentHolder(context, itemView) {
    private val stickerImageView = itemView.findViewById<ImageView>(R.id.img_sent_sticker)
    private val progressBar = itemView.findViewById<ProgressBar>(R.id.progress_sent_sticker)

    override fun bind(message: Message, user: User) {
        super.bind(message, user)

        progressBar.isVisible = message.localPath.isNullOrEmpty()
        if (!message.localPath.isNullOrEmpty()) {
            Glide.with(itemView.context).load(message.localPath).into(stickerImageView)
        }
    }
}