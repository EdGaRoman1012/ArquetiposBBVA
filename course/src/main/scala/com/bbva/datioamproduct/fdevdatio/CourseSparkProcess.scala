package com.bbva.datioamproduct.fdevdatio

import com.datio.dataproc.sdk.api.SparkProcess
import com.datio.dataproc.sdk.api.context.RuntimeContext
import org.slf4j.{Logger, LoggerFactory}

class CourseSparkProcess extends SparkProcess{
  private val logger:Logger = LoggerFactory.getLogger(this.getClass)

  override def runProcess(runtimeContext: RuntimeContext): Int = {
    logger.info("Hola Mundo")
    0
  }

  override def getProcessId: String = "CourseSparkProcess"
}
