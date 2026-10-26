/*
 * This file has been modified by Day Delight Inc. in 2020.
 * Original: https://github.com/bassaer/ChatMessageView (Copyright 2019 Tsubasa Nakayama)
 * Changes:
 *   - Changed the icon parameter of the constructor to nullable (Bitmap?).
 *
 * Licensed under the Apache License, Version 2.0. See the LICENSE file in the root of this repository.
 */

package com.github.bassaer.chatmessageview.model

import android.graphics.Bitmap

class ChatUser(internal var id: Int?, internal var name: String, internal var icon: Bitmap?) : IChatUser {

    override fun getId(): String {
        return this.id!!.toString()
    }

    override fun getName(): String? {
        return this.name
    }

    override fun getIcon(): Bitmap? {
        return this.icon
    }

    override fun setIcon(bmp: Bitmap) {
        this.icon = bmp
    }
}
