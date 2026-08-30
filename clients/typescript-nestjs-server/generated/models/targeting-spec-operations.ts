import { TargetingSpecOperationGeo } from './targeting-spec-operation-geo';
import { TargetingSpecOperationMaximumAge } from './targeting-spec-operation-maximum-age';
import { TargetingSpecOperationAgeBucket } from './targeting-spec-operation-age-bucket';
import { TargetingSpecOperationShoppingRetargeting } from './targeting-spec-operation-shopping-retargeting';
import { TargetingSpecOperationAudienceExclude } from './targeting-spec-operation-audience-exclude';
import { TargetingSpecOperationLocation } from './targeting-spec-operation-location';
import { TargetingSpecOperationLocale } from './targeting-spec-operation-locale';
import { TargetingSpecOperationInterest } from './targeting-spec-operation-interest';
import { TargetingSpecShoppingRetargeting } from './targeting-spec-shopping-retargeting';
import { TargetingSpecOperationAppType } from './targeting-spec-operation-app-type';
import { TargetingSpecOperationGeoExclude } from './targeting-spec-operation-geo-exclude';
import { TargetingSpecOperationGender } from './targeting-spec-operation-gender';
import { TargetingSpecOperationAudienceInclude } from './targeting-spec-operation-audience-include';
import { TargetingSpecOperationMinimumAge } from './targeting-spec-operation-minimum-age';
import { TargetingSpecOperationLocationExclude } from './targeting-spec-operation-location-exclude';


/**
 * @type TargetingSpecOperations
 * @export
 */
export type TargetingSpecOperations = TargetingSpecOperationAgeBucket | TargetingSpecOperationAppType | TargetingSpecOperationAudienceExclude | TargetingSpecOperationAudienceInclude | TargetingSpecOperationGender | TargetingSpecOperationGeo | TargetingSpecOperationGeoExclude | TargetingSpecOperationInterest | TargetingSpecOperationLocale | TargetingSpecOperationLocation | TargetingSpecOperationLocationExclude | TargetingSpecOperationMaximumAge | TargetingSpecOperationMinimumAge | TargetingSpecOperationShoppingRetargeting;

