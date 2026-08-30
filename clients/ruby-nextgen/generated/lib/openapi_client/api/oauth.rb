# frozen_string_literal: true

module OpenapiClient
  module Api
    class Oauth
      def initialize(connection)
        @connection = connection
      end

      def conversion_token
        @connection.call(
          :POST,
          '/oauth/conversion_token',
          type: OpenapiClient::Models::ConversionAccessToken,
          auth: ['pinterest_oauth2']
        )
      end

      def token(grant_type:, code: nil, continuous_refresh: nil, redirect_uri: nil, refresh_token: nil, scope: nil)
        raise ArgumentError, 'grant_type is required' if grant_type.nil?

        @connection.call(
          :POST,
          '/oauth/token',
          type: OpenapiClient::Models::OauthAccessToken,
          auth: ['basic'],
          form: { 'code' => code, 'continuous_refresh' => continuous_refresh, 'grant_type' => grant_type, 'redirect_uri' => redirect_uri, 'refresh_token' => refresh_token, 'scope' => scope }
        )
      end

      def token_revoke(token:, token_type_hint: nil)
        raise ArgumentError, 'token is required' if token.nil?

        @connection.call(
          :POST,
          '/oauth/token/revoke',
          type: nil,
          auth: ['basic'],
          form: { 'token' => token, 'token_type_hint' => token_type_hint }
        )
      end
    end
  end
end
