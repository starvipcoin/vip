package com.devlomi.fireapp.adapters.messaging.holders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/devlomi/fireapp/adapters/messaging/holders/SentTextHolder;", "Lcom/devlomi/fireapp/adapters/messaging/holders/base/BaseSentHolder;", "context", "Landroid/content/Context;", "itemView", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "tvMessageContent", "Lcom/aghajari/emojiview/view/AXEmojiTextView;", "bind", "", "message", "Lcom/devlomi/fireapp/model/realms/Message;", "user", "Lcom/devlomi/fireapp/model/realms/User;", "app_debug"})
public final class SentTextHolder extends com.devlomi.fireapp.adapters.messaging.holders.base.BaseSentHolder {
    private com.aghajari.emojiview.view.AXEmojiTextView tvMessageContent;
    
    public SentTextHolder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null, null);
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.devlomi.fireapp.model.realms.Message message, @org.jetbrains.annotations.NotNull()
    com.devlomi.fireapp.model.realms.User user) {
    }
}