# frozen_string_literal: true

module OpenapiClient
  module Api
    class Resources::Targeting
      def initialize(connection)
        @connection = connection
      end

      def get(targeting_type:, ad_account_id: nil, client_id: nil, oauth_signature: nil, timestamp: nil)
        raise ArgumentError, 'targeting_type is required' if targeting_type.nil?

        @connection.call(
          :GET,
          '/resources/targeting/{targeting_type}'
            .gsub('{targeting_type}', ERB::Util.url_encode(targeting_type.to_s)),
          type: nil,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id, 'client_id' => client_id, 'oauth_signature' => oauth_signature, 'timestamp' => timestamp }
        )
      end

      def interests(interest_id:)
        raise ArgumentError, 'interest_id is required' if interest_id.nil?

        @connection.call(
          :GET,
          '/resources/targeting/interests/{interest_id}'
            .gsub('{interest_id}', ERB::Util.url_encode(interest_id.to_s)),
          type: OpenapiClient::Models::SingleInterestTargetingOption,
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end
    end
  end
end
