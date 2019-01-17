package modules

import net.codingwell.scalaguice.ScalaModule

trait Service {
  def message: String
}

class ServiceProvider extends Service {
  def message: String = "..."
}

class Module extends ScalaModule {

  override def configure() {
    bind[Service].to[ServiceProvider]
  }

}
