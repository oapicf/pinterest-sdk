import { AudienceDemographicValue } from './audience-demographic-value';


/**
 * Audience demographics
 */
export interface AudienceDemographics { 
  /**
   * Ages distribution.
   */
  ages?: Array<AudienceDemographicValue>;
  /**
   * Country area distribution.
   */
  countries?: Array<AudienceDemographicValue>;
  /**
   * Device usage distribution.
   */
  devices?: Array<AudienceDemographicValue>;
  /**
   * Gender distribution.
   */
  genders?: Array<AudienceDemographicValue>;
  /**
   * Geographic metro area distribution.
   */
  metros?: Array<AudienceDemographicValue>;
}

