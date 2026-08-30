# frozen_string_literal: true

module OpenapiClient
  module Api
    class Businesses::SystemUsers
      def initialize(connection)
        @connection = connection
      end

      def partial_update(business_id:, system_user_id:, system_user_update_with_required_body:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'system_user_id is required' if system_user_id.nil?
        raise ArgumentError, 'system_user_update_with_required_body is required' if system_user_update_with_required_body.nil?

        @connection.call(
          :PATCH,
          '/businesses/{business_id}/system_users/{system_user_id}'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s))
            .gsub('{system_user_id}', ERB::Util.url_encode(system_user_id.to_s)),
          type: nil,
          auth: ['pinterest_oauth2'],
          body: system_user_update_with_required_body
        )
      end
    end
  end
end
