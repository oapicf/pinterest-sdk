import { NullablePartnerType } from './nullable-partner-type';


export interface DeleteBusinessPartnersDelete { 
  /**
   * A list of partner ids to be deleted
   */
  partner_ids: Array<string>;
  partner_type?: NullablePartnerType | null;
}
export namespace DeleteBusinessPartnersDelete {
}


