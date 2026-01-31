# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictBool, StrictStr, field_validator
from typing import Any, List, Optional
from typing_extensions import Annotated
from openapi_server.models.business_asset_members_get200_response import BusinessAssetMembersGet200Response
from openapi_server.models.business_asset_partners_get200_response import BusinessAssetPartnersGet200Response
from openapi_server.models.business_assets_get200_response import BusinessAssetsGet200Response
from openapi_server.models.business_member_assets_get200_response import BusinessMemberAssetsGet200Response
from openapi_server.models.business_members_asset_access_delete_request import BusinessMembersAssetAccessDeleteRequest
from openapi_server.models.business_partner_asset_access_get200_response import BusinessPartnerAssetAccessGet200Response
from openapi_server.models.create_asset_group_body import CreateAssetGroupBody
from openapi_server.models.create_asset_group_response import CreateAssetGroupResponse
from openapi_server.models.delete_asset_group_body import DeleteAssetGroupBody
from openapi_server.models.delete_asset_group_response import DeleteAssetGroupResponse
from openapi_server.models.delete_member_access_results_response_array import DeleteMemberAccessResultsResponseArray
from openapi_server.models.delete_partner_asset_access_body import DeletePartnerAssetAccessBody
from openapi_server.models.delete_partner_assets_results_response_array import DeletePartnerAssetsResultsResponseArray
from openapi_server.models.error import Error
from openapi_server.models.permissions_with_owner import PermissionsWithOwner
from openapi_server.models.update_asset_group_body import UpdateAssetGroupBody
from openapi_server.models.update_asset_group_response import UpdateAssetGroupResponse
from openapi_server.models.update_member_asset_access_body import UpdateMemberAssetAccessBody
from openapi_server.models.update_member_assets_results_response_array import UpdateMemberAssetsResultsResponseArray
from openapi_server.models.update_partner_asset_access_body import UpdatePartnerAssetAccessBody
from openapi_server.models.update_partner_assets_results_response_array import UpdatePartnerAssetsResultsResponseArray
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseBusinessAccessAssetsApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseBusinessAccessAssetsApi.subclasses = BaseBusinessAccessAssetsApi.subclasses + (cls,)
    async def business_asset_members_get(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        asset_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of a business asset.")],
        fetch_system_users: Annotated[Optional[StrictBool], Field(description="Fetches system users if True. Fetches regular user employees if False.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
        start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")],
    ) -> BusinessAssetMembersGet200Response:
        """Get all the members the requesting business has granted access to on the given asset."""
        ...


    async def business_asset_partners_get(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        asset_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of a business asset.")],
        start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
    ) -> BusinessAssetPartnersGet200Response:
        """Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner."""
        ...


    async def business_assets_get(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        permissions: Annotated[Optional[List[PermissionsWithOwner]], Field(description="A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.")],
        child_asset_id: Annotated[Optional[Annotated[str, Field(min_length=1, strict=True, max_length=20)]], Field(description="A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.")],
        asset_group_id: Annotated[Optional[Annotated[str, Field(min_length=1, strict=True, max_length=20)]], Field(description="An asset group unique identifier. Used to fetch assets contained within the specified asset group.")],
        asset_type: Annotated[Optional[StrictStr], Field(description="A resource type to filter the assets by. Only assets of the specified type will be returned.")],
        start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
    ) -> BusinessAssetsGet200Response:
        """Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships."""
        ...


    async def business_member_assets_get(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        member_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="The member id to fetch assets for.")],
        asset_type: Annotated[Optional[StrictStr], Field(description="A resource type to filter the assets by. Only assets of the specified type will be returned.")],
        start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
    ) -> BusinessMemberAssetsGet200Response:
        """Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type."""
        ...


    async def business_members_asset_access_delete(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        business_members_asset_access_delete_request: Annotated[BusinessMembersAssetAccessDeleteRequest, Field(description="List member assset permissions to delete.")],
    ) -> DeleteMemberAccessResultsResponseArray:
        """Terminate multiple members&#39; access to an asset."""
        ...


    async def business_members_asset_access_update(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        update_member_asset_access_body: Annotated[UpdateMemberAssetAccessBody, Field(description="List of member asset permissions to create or update.")],
    ) -> UpdateMemberAssetsResultsResponseArray:
        """Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. """
        ...


    async def delete_partner_asset_access_handler_impl(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        delete_partner_asset_access_body: DeletePartnerAssetAccessBody,
    ) -> DeletePartnerAssetsResultsResponseArray:
        """Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets."""
        ...


    async def update_partner_asset_access_handler_impl(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        update_partner_asset_access_body: Annotated[UpdatePartnerAssetAccessBody, Field(description="A list of assets and permissions to assign to your partners.")],
    ) -> UpdatePartnerAssetsResultsResponseArray:
        """Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE."""
        ...


    async def business_partner_asset_access_get(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        partner_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="The partner id to be bound to the Business")],
        partner_type: Annotated[Optional[Any], Field(description="Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.")],
        asset_type: Annotated[Optional[StrictStr], Field(description="A resource type to filter the assets by. Only assets of the specified type will be returned.")],
        start_index: Annotated[Optional[Annotated[int, Field(strict=True, ge=0)]], Field(description="An index to start fetching the results from. Only the results starting from this index will be returned.")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
    ) -> BusinessPartnerAssetAccessGet200Response:
        """Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to."""
        ...


    async def asset_group_create(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        create_asset_group_body: CreateAssetGroupBody,
    ) -> CreateAssetGroupResponse:
        """Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts."""
        ...


    async def asset_group_delete(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        delete_asset_group_body: DeleteAssetGroupBody,
    ) -> DeleteAssetGroupResponse:
        """Delete a batch of asset groups."""
        ...


    async def asset_group_update(
        self,
        business_id: Annotated[str, Field(min_length=1, strict=True, max_length=20, description="Unique identifier of the requesting business.")],
        update_asset_group_body: UpdateAssetGroupBody,
    ) -> UpdateAssetGroupResponse:
        """Update a batch of asset groups with the specified parameters."""
        ...
