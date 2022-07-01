package org.openapitools

import api._
import play.api.inject.{Binding, Module => PlayModule}
import play.api.{Configuration, Environment}

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
class Module extends PlayModule {
  override def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = Seq(
    bind[AdAccountsApi].to[AdAccountsApiImpl],
    bind[BoardsApi].to[BoardsApiImpl],
    bind[CatalogsApi].to[CatalogsApiImpl],
    bind[MediaApi].to[MediaApiImpl],
    bind[OauthApi].to[OauthApiImpl],
    bind[PinsApi].to[PinsApiImpl],
    bind[UserAccountApi].to[UserAccountApiImpl]
  )
}
