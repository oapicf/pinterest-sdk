//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/conversion_events_data_inner_custom_data_contents_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_events_data_inner_custom_data.g.dart';

/// Object containing other custom data.
///
/// Properties:
/// * [contentBrand] - The brand of the content associated with the event.
/// * [contentCategory] - The category of the content associated with the event.
/// * [contentIds] - List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
/// * [contentName] - The name of the page or product associated with the event.
/// * [contents] - A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
/// * [currency] - The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
/// * [externalMeasurementId] - Only use when instructed.
/// * [externalMeasurementVendorId] - Only use when instructed.
/// * [np] - Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
/// * [numItems] - Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
/// * [optOutType] - Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">limited data processing</a> and the developer's guide for <a href=\"/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\" target=\"_blank\">tracking conversion events</a> for help with using this parameter.
/// * [orderId] - The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
/// * [predictedLtv] - Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
/// * [searchString] - The search string related to the user conversion event.
/// * [value] - Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
@BuiltValue()
abstract class ConversionEventsDataInnerCustomData implements Built<ConversionEventsDataInnerCustomData, ConversionEventsDataInnerCustomDataBuilder> {
  /// The brand of the content associated with the event.
  @BuiltValueField(wireName: r'content_brand')
  String? get contentBrand;

  /// The category of the content associated with the event.
  @BuiltValueField(wireName: r'content_category')
  String? get contentCategory;

  /// List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  @BuiltValueField(wireName: r'content_ids')
  BuiltList<String>? get contentIds;

  /// The name of the page or product associated with the event.
  @BuiltValueField(wireName: r'content_name')
  String? get contentName;

  /// A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  @BuiltValueField(wireName: r'contents')
  BuiltList<ConversionEventsDataInnerCustomDataContentsInner>? get contents;

  /// The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
  @BuiltValueField(wireName: r'currency')
  String? get currency;

  /// Only use when instructed.
  @BuiltValueField(wireName: r'external_measurement_id')
  String? get externalMeasurementId;

  /// Only use when instructed.
  @BuiltValueField(wireName: r'external_measurement_vendor_id')
  int? get externalMeasurementVendorId;

  /// Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
  @BuiltValueField(wireName: r'np')
  String? get np;

  /// Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  @BuiltValueField(wireName: r'num_items')
  int? get numItems;

  /// Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">limited data processing</a> and the developer's guide for <a href=\"/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\" target=\"_blank\">tracking conversion events</a> for help with using this parameter.
  @BuiltValueField(wireName: r'opt_out_type')
  String? get optOutType;

  /// The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
  @BuiltValueField(wireName: r'order_id')
  String? get orderId;

  /// Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
  @BuiltValueField(wireName: r'predicted_ltv')
  String? get predictedLtv;

  /// The search string related to the user conversion event.
  @BuiltValueField(wireName: r'search_string')
  String? get searchString;

  /// Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
  @BuiltValueField(wireName: r'value')
  String? get value;

  ConversionEventsDataInnerCustomData._();

  factory ConversionEventsDataInnerCustomData([void updates(ConversionEventsDataInnerCustomDataBuilder b)]) = _$ConversionEventsDataInnerCustomData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionEventsDataInnerCustomDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionEventsDataInnerCustomData> get serializer => _$ConversionEventsDataInnerCustomDataSerializer();
}

class _$ConversionEventsDataInnerCustomDataSerializer implements PrimitiveSerializer<ConversionEventsDataInnerCustomData> {
  @override
  final Iterable<Type> types = const [ConversionEventsDataInnerCustomData, _$ConversionEventsDataInnerCustomData];

  @override
  final String wireName = r'ConversionEventsDataInnerCustomData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionEventsDataInnerCustomData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.contentBrand != null) {
      yield r'content_brand';
      yield serializers.serialize(
        object.contentBrand,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.contentCategory != null) {
      yield r'content_category';
      yield serializers.serialize(
        object.contentCategory,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.contentIds != null) {
      yield r'content_ids';
      yield serializers.serialize(
        object.contentIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.contentName != null) {
      yield r'content_name';
      yield serializers.serialize(
        object.contentName,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.contents != null) {
      yield r'contents';
      yield serializers.serialize(
        object.contents,
        specifiedType: const FullType(BuiltList, [FullType(ConversionEventsDataInnerCustomDataContentsInner)]),
      );
    }
    if (object.currency != null) {
      yield r'currency';
      yield serializers.serialize(
        object.currency,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.externalMeasurementId != null) {
      yield r'external_measurement_id';
      yield serializers.serialize(
        object.externalMeasurementId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.externalMeasurementVendorId != null) {
      yield r'external_measurement_vendor_id';
      yield serializers.serialize(
        object.externalMeasurementVendorId,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.np != null) {
      yield r'np';
      yield serializers.serialize(
        object.np,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.numItems != null) {
      yield r'num_items';
      yield serializers.serialize(
        object.numItems,
        specifiedType: const FullType(int),
      );
    }
    if (object.optOutType != null) {
      yield r'opt_out_type';
      yield serializers.serialize(
        object.optOutType,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.orderId != null) {
      yield r'order_id';
      yield serializers.serialize(
        object.orderId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.predictedLtv != null) {
      yield r'predicted_ltv';
      yield serializers.serialize(
        object.predictedLtv,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.searchString != null) {
      yield r'search_string';
      yield serializers.serialize(
        object.searchString,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.value != null) {
      yield r'value';
      yield serializers.serialize(
        object.value,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionEventsDataInnerCustomData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionEventsDataInnerCustomDataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'content_brand':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.contentBrand = valueDes;
          break;
        case r'content_category':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.contentCategory = valueDes;
          break;
        case r'content_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.contentIds.replace(valueDes);
          break;
        case r'content_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.contentName = valueDes;
          break;
        case r'contents':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ConversionEventsDataInnerCustomDataContentsInner)]),
          ) as BuiltList<ConversionEventsDataInnerCustomDataContentsInner>;
          result.contents.replace(valueDes);
          break;
        case r'currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.currency = valueDes;
          break;
        case r'external_measurement_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.externalMeasurementId = valueDes;
          break;
        case r'external_measurement_vendor_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.externalMeasurementVendorId = valueDes;
          break;
        case r'np':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.np = valueDes;
          break;
        case r'num_items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.numItems = valueDes;
          break;
        case r'opt_out_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.optOutType = valueDes;
          break;
        case r'order_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.orderId = valueDes;
          break;
        case r'predicted_ltv':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.predictedLtv = valueDes;
          break;
        case r'search_string':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.searchString = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.value = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionEventsDataInnerCustomData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionEventsDataInnerCustomDataBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

