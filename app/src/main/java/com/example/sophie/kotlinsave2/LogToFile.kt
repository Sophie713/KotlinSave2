package com.example.sophie.kotlinsave2

/**
 * Created by Sophie on 1/26/2018.
 */

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.EditText
import java.io.File
import java.io.IOException
import java.util.logging.FileHandler
import java.util.logging.Logger

import java.util.logging.SimpleFormatter

class LogToFile(val context: Context) {

    val formatter = SimpleFormatter()
    val logger = Logger.getLogger("MyLog")
    val dest = context.applicationContext.getExternalFilesDir(null);
    val fh = FileHandler(dest.path.plus(File.pathSeparator).plus("data.txt"))

    init {
        logger.addHandler(fh)
        fh.formatter = formatter
    }






    fun write(logString: String) {
        //val logger = Logger.getLogger("MyLog")
        //val dest = context.applicationContext.getExternalFilesDir(null);
        //val fh = FileHandler(dest.path.plus(File.pathSeparator).plus("data.txt"))
        try {
            //val dest = context.applicationContext.getExternalFilesDir(null);
            // This block configure the logger with handler and formatter
            //fh = FileHandler(dest.path.plus(File.pathSeparator).plus("data.txt"))

            //logger.addHandler(fh)
            //fh.formatter = formatter
            // the following statement is used to log any messages
            logger.info(logString)

        } catch (e: SecurityException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}