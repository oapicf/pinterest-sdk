

/**
 * Resource create operation model.
 */
export interface AdsCreditRedeemCreate { 
  /**
   * Takes in a SHA256 hash of the offerCode.
   */
  offerCodeHash: string;
  /**
   * If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
   */
  validateOnly: boolean;
}

