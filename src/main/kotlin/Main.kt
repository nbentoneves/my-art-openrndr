import org.openrndr.application
import org.openrndr.extensions.Screenshots

fun main(args: Array<String>) {
    myArtOpenrndr()
}

fun myArtOpenrndr() = application {
    configure {
        width = 600
        height = 600
    }

    program {
        extend(Screenshots())
        extend {
            drawer.circle(width/2.0, height/2.0, 100.0)

        }

    }
}
