package group.karbon.bifrost.example

import arrow.core.raise.Raise
import group.bifrost.extension.Extension
import group.bifrost.extension.ExtensionError
import group.bifrost.extension.ExtensionMeta
import group.bifrost.extension.asExtensionId


class ExampleExtension : Extension(
    ExtensionMeta(
        id = "my-example-extension".asExtensionId(),
        name = "example extension"
    )
) {

    override suspend fun Raise<ExtensionError>.onLoad() {
        TODO("Not yet implemented")
    }

    override suspend fun Raise<ExtensionError>.onEnable() {
        TODO("Not yet implemented")
    }


}



