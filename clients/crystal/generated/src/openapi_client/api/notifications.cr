require "json"

module OpenAPIClient
  module Api
  class Notifications
    def initialize(@conn : Connection); end

    # Receive notifications from external partners. Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature.
    def create(notification_post_request : OpenAPIClient::NotificationPostRequest) : Response(OpenAPIClient::NotificationResponse)
      @conn.request(OpenAPIClient::NotificationResponse,
        method: :POST,
        path: "/notifications",
        body: notification_post_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
