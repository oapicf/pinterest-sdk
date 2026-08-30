# frozen_string_literal: true

module OpenapiClient
  module Api
    class Notifications
      def initialize(connection)
        @connection = connection
      end

      def create(notification_post_request:)
        raise ArgumentError, 'notification_post_request is required' if notification_post_request.nil?

        @connection.call(
          :POST,
          '/notifications',
          type: OpenapiClient::Models::NotificationResponse,
          auth: ['pinterest_oauth2', 'client_credentials'],
          body: notification_post_request
        )
      end
    end
  end
end
