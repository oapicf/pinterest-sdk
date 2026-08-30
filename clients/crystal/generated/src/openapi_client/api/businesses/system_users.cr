require "json"

module OpenAPIClient
  module Api
  class Businesses::SystemUsers
    def initialize(@conn : Connection); end

    # Update a system user information. Update a system user information such as name.
    def partial_update(business_id : String, system_user_id : String, system_user_update_with_required_body : OpenAPIClient::SystemUserUpdateWithRequiredBody) : Response(Nil)
      @conn.request(Nil,
        method: :PATCH,
        path: "/businesses/{business_id}/system_users/{system_user_id}".sub("{business_id}", OpenAPIClient.enc(business_id)).sub("{system_user_id}", OpenAPIClient.enc(system_user_id)),
        body: system_user_update_with_required_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
