

export interface KeywordUpdateGenerated { 
  /**
   * Is keyword archived?
   */
  archived?: boolean;
  /**
   * </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
   */
  bid?: number | null;
  /**
   * Keyword ID.
   */
  id: string;
}

