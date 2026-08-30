# frozen_string_literal: true

module OpenapiClient
  module Api
    class UserAccount::Businesses
      def initialize(connection)
        @connection = connection
      end

      def list
        @connection.call(
          :GET,
          '/user_account/businesses',
          type: [OpenapiClient::Models::LinkedBusiness],
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end
    end
  end
end
