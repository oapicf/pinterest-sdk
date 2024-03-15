#tag Class
Protected Class AdsCreditDiscountsResponse

	#tag Property, Flags = &h0
		#tag Note
			True if the offer code is currently active.
		#tag EndNote
		active As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Advertiser ID the offer was applied to.
		#tag EndNote
		advertiser_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The type of discount of this credit
		#tag EndNote
		discountType As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The discount applied in the offer’s currency value.
		#tag EndNote
		discountInMicroCurrency As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Currency value for the discount.
		#tag EndNote
		discountCurrency As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Human readable title of the offer code.
		#tag EndNote
		title As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The credits left to spend.
		#tag EndNote
		remainingDiscountInMicroCurrency As Xoson.O.OptionalDouble
	#tag EndProperty


    #tag Enum, Name = DiscountTypeEnum, Type = Integer, Flags = &h0
        
        Coupon
        Credit
        CouponApplied
        CreditApplied
        MarketingOfferCredit
        MarketingOfferCreditApplied
        GoodwillCredit
        GoodwillCreditApplied
        InternalCredit
        InternalCreditApplied
        PrepaidCredit
        PrepaidCreditApplied
        SalesIncentiveCredit
        SalesIncentiveCreditApplied
        CreditExpired
        FutureCredit
        ReferralCredit
        InvoiceSalesIncentiveCredit
        InvoiceSalesIncentiveCreditApplied
        PrepaidCreditRefund
        Null
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function DiscountTypeEnumToString(value As DiscountTypeEnum) As String
		  Select Case value
		    
		    Case DiscountTypeEnum.Coupon
		      Return "COUPON"
		    Case DiscountTypeEnum.Credit
		      Return "CREDIT"
		    Case DiscountTypeEnum.CouponApplied
		      Return "COUPON_APPLIED"
		    Case DiscountTypeEnum.CreditApplied
		      Return "CREDIT_APPLIED"
		    Case DiscountTypeEnum.MarketingOfferCredit
		      Return "MARKETING_OFFER_CREDIT"
		    Case DiscountTypeEnum.MarketingOfferCreditApplied
		      Return "MARKETING_OFFER_CREDIT_APPLIED"
		    Case DiscountTypeEnum.GoodwillCredit
		      Return "GOODWILL_CREDIT"
		    Case DiscountTypeEnum.GoodwillCreditApplied
		      Return "GOODWILL_CREDIT_APPLIED"
		    Case DiscountTypeEnum.InternalCredit
		      Return "INTERNAL_CREDIT"
		    Case DiscountTypeEnum.InternalCreditApplied
		      Return "INTERNAL_CREDIT_APPLIED"
		    Case DiscountTypeEnum.PrepaidCredit
		      Return "PREPAID_CREDIT"
		    Case DiscountTypeEnum.PrepaidCreditApplied
		      Return "PREPAID_CREDIT_APPLIED"
		    Case DiscountTypeEnum.SalesIncentiveCredit
		      Return "SALES_INCENTIVE_CREDIT"
		    Case DiscountTypeEnum.SalesIncentiveCreditApplied
		      Return "SALES_INCENTIVE_CREDIT_APPLIED"
		    Case DiscountTypeEnum.CreditExpired
		      Return "CREDIT_EXPIRED"
		    Case DiscountTypeEnum.FutureCredit
		      Return "FUTURE_CREDIT"
		    Case DiscountTypeEnum.ReferralCredit
		      Return "REFERRAL_CREDIT"
		    Case DiscountTypeEnum.InvoiceSalesIncentiveCredit
		      Return "INVOICE_SALES_INCENTIVE_CREDIT"
		    Case DiscountTypeEnum.InvoiceSalesIncentiveCreditApplied
		      Return "INVOICE_SALES_INCENTIVE_CREDIT_APPLIED"
		    Case DiscountTypeEnum.PrepaidCreditRefund
		      Return "PREPAID_CREDIT_REFUND"
		    Case DiscountTypeEnum.Null
		      Return "null"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="active"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="advertiser_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="discountInMicroCurrency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="discountCurrency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="title"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="remainingDiscountInMicroCurrency"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


