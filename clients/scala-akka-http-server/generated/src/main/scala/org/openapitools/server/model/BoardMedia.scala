package org.openapitools.server.model


/**
 * Board media.
 *
 * @param imageCoverUrl Board cover image. for example: ''https://i.pinimg.com/400x300/fd/cd/d5/fdcdd5a6d8a80824add0d054125cd957.jpg''
 * @param pinThumbnailUrls Board pin thumbnail urls. for example: ''["https://i.pinimg.com/150x150/b4/57/10/b45710f1ede96af55230f4b43935c4af.jpg","https://i.pinimg.com/150x150/dd/ff/46/ddff4616e39c1935cd05738794fa860e.jpg","https://i.pinimg.com/150x150/84/ac/59/84ac59b670ccb5b903dace480a98930c.jpg","https://i.pinimg.com/150x150/4c/54/6f/4c546f521be85e30838fb742bfff6936.jpg"]''
*/
final case class BoardMedia (
  imageCoverUrl: Option[String] = None,
  pinThumbnailUrls: Option[Seq[String]] = None
)

