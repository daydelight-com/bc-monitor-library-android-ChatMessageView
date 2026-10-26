# Modifications

This repository contains a modified version of [ChatMessageView](https://github.com/bassaer/ChatMessageView)
(Copyright 2019 Tsubasa Nakayama), which is licensed under the Apache License, Version 2.0.
See [LICENSE](LICENSE) for the full license text.

The modifications were made by Day Delight Inc. in 2020, based on the tag `2.1.0` of the original
repository, and are released as the tags `2.1.0-1` to `2.1.0-4`.

## Summary of changes

- Made the `Message`, `MessageAdapter` and `MessageView` classes open so that they can be subclassed.
- Adjusted the nullability of some parameters to match the existing application code.
- Disabled publishing to Bintray and enabled building with JitPack.

## Modified files

Each of the following files carries a notice describing its changes at the top of the file.

| File | Changes |
|---|---|
| `chatmessageview/src/main/kotlin/com/github/bassaer/chatmessageview/model/ChatUser.kt` | Nullable `icon` parameter |
| `chatmessageview/src/main/kotlin/com/github/bassaer/chatmessageview/model/Message.kt` | `open` class |
| `chatmessageview/src/main/kotlin/com/github/bassaer/chatmessageview/view/MessageAdapter.kt` | `open` class, non-null `parent` parameter of `getView()` |
| `chatmessageview/src/main/kotlin/com/github/bassaer/chatmessageview/view/MessageView.kt` | `open` class |
| `chatmessageview/build.gradle` | Disabled Bintray / local Maven publishing, JitPack build |
| `build.gradle` | Replaced the Bintray plugin with the android-maven plugin for JitPack |
