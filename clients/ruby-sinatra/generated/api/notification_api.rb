require 'json'


MyApp.add_route('POST', '/v5/notifications', {
  "resourcePath" => "/Notification",
  "summary" => "Receive notifications from external partners.",
  "nickname" => "notification/post",
  "responseClass" => "NotificationResponse",
  "endpoint" => "/notifications",
  "notes" => "Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.",
  "parameters" => [
    {
      "name" => "body",
      "description" => "notification event.",
      "dataType" => "NotificationPostRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

