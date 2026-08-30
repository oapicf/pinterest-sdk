# frozen_string_literal: true

module OpenapiClient
  class Client
    attr_reader :configuration, :connection

    def initialize(base_url: nil, **options, &block)
      @configuration = Configuration.new(base_url: base_url, **options, &block)
      @connection = Connection.new(@configuration)
    end

    def ad_accounts
      @ad_accounts ||= OpenapiClient::Api::AdAccounts.new(@connection)
    end

    def advanced_auction
      @advanced_auction ||= OpenapiClient::Api::AdvancedAuction.new(@connection)
    end

    def boards
      @boards ||= OpenapiClient::Api::Boards.new(@connection)
    end

    def business_access
      @business_access ||= OpenapiClient::Api::BusinessAccess.new(@connection)
    end

    def businesses
      @businesses ||= OpenapiClient::Api::Businesses.new(@connection)
    end

    def catalogs
      @catalogs ||= OpenapiClient::Api::Catalogs.new(@connection)
    end

    def integrations
      @integrations ||= OpenapiClient::Api::Integrations.new(@connection)
    end

    def media
      @media ||= OpenapiClient::Api::Media.new(@connection)
    end

    def notifications
      @notifications ||= OpenapiClient::Api::Notifications.new(@connection)
    end

    def oauth
      @oauth ||= OpenapiClient::Api::Oauth.new(@connection)
    end

    def pins
      @pins ||= OpenapiClient::Api::Pins.new(@connection)
    end

    def resources
      @resources ||= OpenapiClient::Api::Resources.new(@connection)
    end

    def search
      @search ||= OpenapiClient::Api::Search.new(@connection)
    end

    def terms
      @terms ||= OpenapiClient::Api::Terms.new(@connection)
    end

    def trends
      @trends ||= OpenapiClient::Api::Trends.new(@connection)
    end

    def user_account
      @user_account ||= OpenapiClient::Api::UserAccount.new(@connection)
    end

    def users
      @users ||= OpenapiClient::Api::Users.new(@connection)
    end
  end
end
