package org.openapitools.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import org.openapitools.server.api.AdAccountsApi
import org.openapitools.server.api.BoardsApi
import org.openapitools.server.api.CatalogsApi
import org.openapitools.server.api.MediaApi
import org.openapitools.server.api.OauthApi
import org.openapitools.server.api.PinsApi
import org.openapitools.server.api.UserAccountApi

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

class Controller(adAccounts: AdAccountsApi, boards: BoardsApi, catalogs: CatalogsApi, media: MediaApi, oauth: OauthApi, pins: PinsApi, userAccount: UserAccountApi)(implicit system: ActorSystem, materializer: ActorMaterializer) {

    lazy val routes: Route = adAccounts.route ~ boards.route ~ catalogs.route ~ media.route ~ oauth.route ~ pins.route ~ userAccount.route 

    Http().bindAndHandle(routes, "0.0.0.0", 9000)
}