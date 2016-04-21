package fxplayground

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.ListView
import javafx.scene.control.TextField
import javafx.scene.layout.VBox
import javafx.stage.Stage

class App : Application(){
    // this is so cool, that I can change from default Stage? to Stage
    override fun start(primaryStage: Stage) {
        val edit = TextField()
        val completionsList = ListView<String>()

        // apply is a ultra cool thing to set properties inside
        // it is actually not a language feature, it is just an extension function!
        val vbox = VBox(edit, completionsList).apply {
            spacing = 15.0
            padding = Insets(15.0)
        }


        primaryStage.scene = Scene(vbox)
        primaryStage.show()
    }

}

fun main(args: Array<String>) {
    Application.launch(App::class.java, *args)
}