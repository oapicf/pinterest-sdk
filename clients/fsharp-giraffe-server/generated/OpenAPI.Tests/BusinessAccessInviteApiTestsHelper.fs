namespace OpenAPI.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open TestHelper
open OpenAPI.BusinessAccessInviteApiHandler
open OpenAPI.BusinessAccessInviteApiHandlerParams

module BusinessAccessInviteApiHandlerTestsHelper =


  let mutable AssetAccessRequestsCreateExamples = Map.empty
  let mutable AssetAccessRequestsCreateBody = ""

  AssetAccessRequestsCreateBody <- WebUtility.HtmlDecode "{
  &quot;asset_requests&quot; : [ {
    &quot;partner_id&quot; : &quot;809944451643622187&quot;,
    &quot;asset_id_to_permissions&quot; : {
      &quot;549760723247&quot; : [ &quot;ANALYST&quot; ],
      &quot;549760723248&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
      &quot;809944451643622187&quot; : [ &quot;PROFILE_PUBLISHER&quot; ]
    }
  }, {
    &quot;partner_id&quot; : &quot;809944451643622187&quot;,
    &quot;asset_id_to_permissions&quot; : {
      &quot;549760723247&quot; : [ &quot;ANALYST&quot; ],
      &quot;549760723248&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
      &quot;809944451643622187&quot; : [ &quot;PROFILE_PUBLISHER&quot; ]
    }
  }, {
    &quot;partner_id&quot; : &quot;809944451643622187&quot;,
    &quot;asset_id_to_permissions&quot; : {
      &quot;549760723247&quot; : [ &quot;ANALYST&quot; ],
      &quot;549760723248&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
      &quot;809944451643622187&quot; : [ &quot;PROFILE_PUBLISHER&quot; ]
    }
  }, {
    &quot;partner_id&quot; : &quot;809944451643622187&quot;,
    &quot;asset_id_to_permissions&quot; : {
      &quot;549760723247&quot; : [ &quot;ANALYST&quot; ],
      &quot;549760723248&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
      &quot;809944451643622187&quot; : [ &quot;PROFILE_PUBLISHER&quot; ]
    }
  }, {
    &quot;partner_id&quot; : &quot;809944451643622187&quot;,
    &quot;asset_id_to_permissions&quot; : {
      &quot;549760723247&quot; : [ &quot;ANALYST&quot; ],
      &quot;549760723248&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
      &quot;809944451643622187&quot; : [ &quot;PROFILE_PUBLISHER&quot; ]
    }
  } ]
}"
  AssetAccessRequestsCreateExamples <- AssetAccessRequestsCreateExamples.Add("application/json", AssetAccessRequestsCreateBody)

  let getAssetAccessRequestsCreateExample mediaType =
    AssetAccessRequestsCreateExamples.[mediaType]
      |> getConverter mediaType

  let mutable CancelInvitesOrRequestsExamples = Map.empty
  let mutable CancelInvitesOrRequestsBody = ""

  CancelInvitesOrRequestsBody <- WebUtility.HtmlDecode "{
  &quot;invite_ids&quot; : [ &quot;1234567890123456789&quot;, &quot;1122334455667788991&quot; ]
}"
  CancelInvitesOrRequestsExamples <- CancelInvitesOrRequestsExamples.Add("application/json", CancelInvitesOrRequestsBody)

  let getCancelInvitesOrRequestsExample mediaType =
    CancelInvitesOrRequestsExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateAssetInvitesExamples = Map.empty
  let mutable CreateAssetInvitesBody = ""

  CreateAssetInvitesBody <- WebUtility.HtmlDecode "{
  &quot;invites&quot; : [ {
    &quot;invite_type&quot; : &quot;MEMBER_INVITE&quot;,
    &quot;invite_id&quot; : &quot;1234567890123&quot;,
    &quot;asset_id_to_permissions&quot; : {
      &quot;549760723247&quot; : [ &quot;ANALYST&quot; ],
      &quot;549760723248&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
      &quot;809944451643622187&quot; : [ &quot;PROFILE_PUBLISHER&quot; ]
    }
  }, {
    &quot;invite_type&quot; : &quot;MEMBER_INVITE&quot;,
    &quot;invite_id&quot; : &quot;1234567890123&quot;,
    &quot;asset_id_to_permissions&quot; : {
      &quot;549760723247&quot; : [ &quot;ANALYST&quot; ],
      &quot;549760723248&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
      &quot;809944451643622187&quot; : [ &quot;PROFILE_PUBLISHER&quot; ]
    }
  }, {
    &quot;invite_type&quot; : &quot;MEMBER_INVITE&quot;,
    &quot;invite_id&quot; : &quot;1234567890123&quot;,
    &quot;asset_id_to_permissions&quot; : {
      &quot;549760723247&quot; : [ &quot;ANALYST&quot; ],
      &quot;549760723248&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
      &quot;809944451643622187&quot; : [ &quot;PROFILE_PUBLISHER&quot; ]
    }
  }, {
    &quot;invite_type&quot; : &quot;MEMBER_INVITE&quot;,
    &quot;invite_id&quot; : &quot;1234567890123&quot;,
    &quot;asset_id_to_permissions&quot; : {
      &quot;549760723247&quot; : [ &quot;ANALYST&quot; ],
      &quot;549760723248&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
      &quot;809944451643622187&quot; : [ &quot;PROFILE_PUBLISHER&quot; ]
    }
  }, {
    &quot;invite_type&quot; : &quot;MEMBER_INVITE&quot;,
    &quot;invite_id&quot; : &quot;1234567890123&quot;,
    &quot;asset_id_to_permissions&quot; : {
      &quot;549760723247&quot; : [ &quot;ANALYST&quot; ],
      &quot;549760723248&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
      &quot;809944451643622187&quot; : [ &quot;PROFILE_PUBLISHER&quot; ]
    }
  } ]
}"
  CreateAssetInvitesExamples <- CreateAssetInvitesExamples.Add("application/json", CreateAssetInvitesBody)

  let getCreateAssetInvitesExample mediaType =
    CreateAssetInvitesExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateMembershipOrPartnershipInvitesExamples = Map.empty
  let mutable CreateMembershipOrPartnershipInvitesBody = ""

  CreateMembershipOrPartnershipInvitesBody <- WebUtility.HtmlDecode "{
  &quot;invite_type&quot; : &quot;MEMBER_INVITE&quot;,
  &quot;partners&quot; : [ &quot;809944451643622187&quot;, &quot;766456567741825556&quot; ],
  &quot;members&quot; : [ &quot;business0101&quot;, &quot;user@business.com&quot; ],
  &quot;business_role&quot; : &quot;BIZ_ADMIN&quot;
}"
  CreateMembershipOrPartnershipInvitesExamples <- CreateMembershipOrPartnershipInvitesExamples.Add("application/json", CreateMembershipOrPartnershipInvitesBody)

  let getCreateMembershipOrPartnershipInvitesExample mediaType =
    CreateMembershipOrPartnershipInvitesExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable RespondBusinessAccessInvitesExamples = Map.empty
  let mutable RespondBusinessAccessInvitesBody = ""

  RespondBusinessAccessInvitesBody <- WebUtility.HtmlDecode "{
  &quot;invites&quot; : [ {
    &quot;invite_id&quot; : &quot;invite_id&quot;,
    &quot;action&quot; : {
      &quot;asset_id_to_permissions&quot; : {
        &quot;549760723247&quot; : [ &quot;ANALYST&quot; ],
        &quot;549760723248&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
        &quot;809944451643622187&quot; : [ &quot;PROFILE_PUBLISHER&quot; ]
      },
      &quot;accept_invite&quot; : true
    }
  }, {
    &quot;invite_id&quot; : &quot;invite_id&quot;,
    &quot;action&quot; : {
      &quot;asset_id_to_permissions&quot; : {
        &quot;549760723247&quot; : [ &quot;ANALYST&quot; ],
        &quot;549760723248&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
        &quot;809944451643622187&quot; : [ &quot;PROFILE_PUBLISHER&quot; ]
      },
      &quot;accept_invite&quot; : true
    }
  }, {
    &quot;invite_id&quot; : &quot;invite_id&quot;,
    &quot;action&quot; : {
      &quot;asset_id_to_permissions&quot; : {
        &quot;549760723247&quot; : [ &quot;ANALYST&quot; ],
        &quot;549760723248&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
        &quot;809944451643622187&quot; : [ &quot;PROFILE_PUBLISHER&quot; ]
      },
      &quot;accept_invite&quot; : true
    }
  }, {
    &quot;invite_id&quot; : &quot;invite_id&quot;,
    &quot;action&quot; : {
      &quot;asset_id_to_permissions&quot; : {
        &quot;549760723247&quot; : [ &quot;ANALYST&quot; ],
        &quot;549760723248&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
        &quot;809944451643622187&quot; : [ &quot;PROFILE_PUBLISHER&quot; ]
      },
      &quot;accept_invite&quot; : true
    }
  }, {
    &quot;invite_id&quot; : &quot;invite_id&quot;,
    &quot;action&quot; : {
      &quot;asset_id_to_permissions&quot; : {
        &quot;549760723247&quot; : [ &quot;ANALYST&quot; ],
        &quot;549760723248&quot; : [ &quot;ANALYST&quot;, &quot;ADMIN&quot; ],
        &quot;809944451643622187&quot; : [ &quot;PROFILE_PUBLISHER&quot; ]
      },
      &quot;accept_invite&quot; : true
    }
  } ]
}"
  RespondBusinessAccessInvitesExamples <- RespondBusinessAccessInvitesExamples.Add("application/json", RespondBusinessAccessInvitesBody)

  let getRespondBusinessAccessInvitesExample mediaType =
    RespondBusinessAccessInvitesExamples.[mediaType]
      |> getConverter mediaType
