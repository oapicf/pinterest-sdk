# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr, field_validator
from typing import List, Optional
from typing_extensions import Annotated
from openapi_server.models.pinterest_lib_error import PinterestLibError
from openapi_server.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_server.models.schedule import Schedule
from openapi_server.models.schedule_batch_update import ScheduleBatchUpdate
from openapi_server.models.schedule_create import ScheduleCreate
from openapi_server.models.schedule_status import ScheduleStatus
from openapi_server.models.schedule_type import ScheduleType
from openapi_server.models.schedules_create200_response_inner import SchedulesCreate200ResponseInner
from openapi_server.models.schedules_list200_response import SchedulesList200Response
from openapi_server.security_api import get_token_pinterest_oauth2

class BaseSchedulesApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseSchedulesApi.subclasses = BaseSchedulesApi.subclasses + (cls,)
    async def schedules_list(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18)],
        entity_ids: Annotated[List[Annotated[str, Field(strict=True)]], Field(min_length=1, description="List of Entity IDs, must be associated with the Ad Accound ID provided in the path.")],
        bookmark: Annotated[Optional[StrictStr], Field(description="Cursor used to fetch the next page of items")],
        page_size: Annotated[Optional[Annotated[int, Field(le=250, strict=True, ge=1)]], Field(description="Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")],
        order: Annotated[Optional[PinterestLibPaginationOrder], Field(description="The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.")],
        schedule_statuses: Annotated[Optional[List[ScheduleStatus]], Field(description="Filter schedules by status (one or more)")],
        schedule_type: Annotated[Optional[ScheduleType], Field(description="Filter schedules by a type")],
    ) -> SchedulesList200Response:
        """Get schedules for a specific advertiser"""
        ...


    async def schedules_create(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18)],
        schedule_create: List[ScheduleCreate],
    ) -> List[SchedulesCreate200ResponseInner]:
        """Batch create schedules"""
        ...


    async def schedules_update(
        self,
        ad_account_id: Annotated[str, Field(strict=True, max_length=18)],
        schedule_batch_update: List[ScheduleBatchUpdate],
    ) -> List[SchedulesCreate200ResponseInner]:
        """Update one or more schedules"""
        ...
