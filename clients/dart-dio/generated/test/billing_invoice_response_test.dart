import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for BillingInvoiceResponse
void main() {
  final instance = BillingInvoiceResponseBuilder();
  // TODO add properties to the builder and call build()

  group(BillingInvoiceResponse, () {
    // The ID of the ad account this invoice belongs to
    // String adAccountId
    test('to test the property `adAccountId`', () async {
      // TODO
    });

    // The name of the ad account this invoice belongs to
    // String adAccountName
    test('to test the property `adAccountName`', () async {
      // TODO
    });

    // The amount billed in this invoice. Denoted in micro currency
    // int amountBilledMicroCurrency
    test('to test the property `amountBilledMicroCurrency`', () async {
      // TODO
    });

    // The discount in this invoice. Denoted in micro currency
    // int amountDiscountMicroCurrency
    test('to test the property `amountDiscountMicroCurrency`', () async {
      // TODO
    });

    // The net amount in this invoice. Denoted in micro currency
    // int amountNetMicroCurrency
    test('to test the property `amountNetMicroCurrency`', () async {
      // TODO
    });

    // The tax in this invoice. Denoted in micro currency
    // int amountTaxMicroCurrency
    test('to test the property `amountTaxMicroCurrency`', () async {
      // TODO
    });

    // The country of the bill to address
    // String billToCountry
    test('to test the property `billToCountry`', () async {
      // TODO
    });

    // The end date of the billing period. Format: YYYY-MM-DD
    // Date billingPeriodEndDate
    test('to test the property `billingPeriodEndDate`', () async {
      // TODO
    });

    // The start date of the billing period. Format: YYYY-MM-DD
    // Date billingPeriodStartDate
    test('to test the property `billingPeriodStartDate`', () async {
      // TODO
    });

    // Currency currency
    test('to test the property `currency`', () async {
      // TODO
    });

    // The type of the document
    // String documentType
    test('to test the property `documentType`', () async {
      // TODO
    });

    // Unique identifier for the billing invoice
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // The date the invoice is due. Format: YYYY-MM-DD
    // Date invoiceDueDate
    test('to test the property `invoiceDueDate`', () async {
      // TODO
    });

    // The payment terms of the invoice
    // String paymentTerms
    test('to test the property `paymentTerms`', () async {
      // TODO
    });

    // The status of the invoice
    // String status
    test('to test the property `status`', () async {
      // TODO
    });

  });
}
