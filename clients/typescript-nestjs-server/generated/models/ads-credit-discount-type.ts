

export const AdsCreditDiscountType = {
    Coupon: 'COUPON',
    Credit: 'CREDIT',
    CouponApplied: 'COUPON_APPLIED',
    CreditApplied: 'CREDIT_APPLIED',
    MarketingOfferCredit: 'MARKETING_OFFER_CREDIT',
    MarketingOfferCreditApplied: 'MARKETING_OFFER_CREDIT_APPLIED',
    GoodwillCredit: 'GOODWILL_CREDIT',
    GoodwillCreditApplied: 'GOODWILL_CREDIT_APPLIED',
    InternalCredit: 'INTERNAL_CREDIT',
    InternalCreditApplied: 'INTERNAL_CREDIT_APPLIED',
    PrepaidCredit: 'PREPAID_CREDIT',
    PrepaidCreditApplied: 'PREPAID_CREDIT_APPLIED',
    SalesIncentiveCredit: 'SALES_INCENTIVE_CREDIT',
    SalesIncentiveCreditApplied: 'SALES_INCENTIVE_CREDIT_APPLIED',
    CreditExpired: 'CREDIT_EXPIRED',
    FutureCredit: 'FUTURE_CREDIT',
    ReferralCredit: 'REFERRAL_CREDIT',
    InvoiceSalesIncentiveCredit: 'INVOICE_SALES_INCENTIVE_CREDIT',
    InvoiceSalesIncentiveCreditApplied: 'INVOICE_SALES_INCENTIVE_CREDIT_APPLIED',
    PrepaidCreditRefund: 'PREPAID_CREDIT_REFUND'
} as const;
export type AdsCreditDiscountType = typeof AdsCreditDiscountType[keyof typeof AdsCreditDiscountType];

