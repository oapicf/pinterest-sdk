//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/currency.dart';
import 'package:openapi/src/model/line_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'event_data.g.dart';

///     Optional for VISITOR `audience_type`.     With the Pinterest tag, you can use event data to capture event details from your website.     This object lists all the available predefined event data fields in the Pinterest tag.     You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated.     Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs.     However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.     Examples per `event` type:     `pagevisit`     \"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }     `signup`     \"event_data\": { \"lead_type\": \"New release promotion\" }     `checkout`     \"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }     `addtocart`     \"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}     `watchvideo`     \"event_data\": { \"video_title\": \"My Product Video 01\" }     `lead`     \"event_data\": { \"lead_type\": \"Newsletter\" }
///
/// Properties:
/// * [currency] - Currency. For example, 'USD'.
/// * [leadType] - Promotion code. For example, 'Newsletter'.
/// * [lineItems] 
/// * [orderId] - Order ID. For example, 'X-151481'.
/// * [orderQuantity] - Order quantity. For example, 1.
/// * [pageName] - Page name. For example, 'Our Favorite Pins on Pinterest'.
/// * [promoCode] - Promotion code. For example, 'WINTER10'.
/// * [property] - Property. For example, 'Athleta'.
/// * [searchQuery] - Search query string. For example, 'boots'.
/// * [value] - Product value. For example, '199.98'.
/// * [videoTitle] - Video title. For example, 'How to style your Parker Boots'.
@BuiltValue()
abstract class EventData implements Built<EventData, EventDataBuilder> {
  /// Currency. For example, 'USD'.
  @BuiltValueField(wireName: r'currency')
  Currency? get currency;
  // enum currencyEnum {  UNK,  USD,  GBP,  CAD,  EUR,  AUD,  NZD,  SEK,  ILS,  CHF,  HKD,  JPY,  SGD,  KRW,  NOK,  DKK,  PLN,  RON,  HUF,  CZK,  BRL,  MXN,  ARS,  CLP,  COP,  INR,  TRY,  };

  /// Promotion code. For example, 'Newsletter'.
  @BuiltValueField(wireName: r'lead_type')
  String? get leadType;

  @BuiltValueField(wireName: r'line_items')
  LineItem? get lineItems;

  /// Order ID. For example, 'X-151481'.
  @BuiltValueField(wireName: r'order_id')
  String? get orderId;

  /// Order quantity. For example, 1.
  @BuiltValueField(wireName: r'order_quantity')
  int? get orderQuantity;

  /// Page name. For example, 'Our Favorite Pins on Pinterest'.
  @BuiltValueField(wireName: r'page_name')
  String? get pageName;

  /// Promotion code. For example, 'WINTER10'.
  @BuiltValueField(wireName: r'promo_code')
  String? get promoCode;

  /// Property. For example, 'Athleta'.
  @BuiltValueField(wireName: r'property')
  String? get property;

  /// Search query string. For example, 'boots'.
  @BuiltValueField(wireName: r'search_query')
  String? get searchQuery;

  /// Product value. For example, '199.98'.
  @BuiltValueField(wireName: r'value')
  String? get value;

  /// Video title. For example, 'How to style your Parker Boots'.
  @BuiltValueField(wireName: r'video_title')
  String? get videoTitle;

  EventData._();

  factory EventData([void updates(EventDataBuilder b)]) = _$EventData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EventDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EventData> get serializer => _$EventDataSerializer();
}

class _$EventDataSerializer implements PrimitiveSerializer<EventData> {
  @override
  final Iterable<Type> types = const [EventData, _$EventData];

  @override
  final String wireName = r'EventData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EventData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.currency != null) {
      yield r'currency';
      yield serializers.serialize(
        object.currency,
        specifiedType: const FullType(Currency),
      );
    }
    if (object.leadType != null) {
      yield r'lead_type';
      yield serializers.serialize(
        object.leadType,
        specifiedType: const FullType(String),
      );
    }
    if (object.lineItems != null) {
      yield r'line_items';
      yield serializers.serialize(
        object.lineItems,
        specifiedType: const FullType(LineItem),
      );
    }
    if (object.orderId != null) {
      yield r'order_id';
      yield serializers.serialize(
        object.orderId,
        specifiedType: const FullType(String),
      );
    }
    if (object.orderQuantity != null) {
      yield r'order_quantity';
      yield serializers.serialize(
        object.orderQuantity,
        specifiedType: const FullType(int),
      );
    }
    if (object.pageName != null) {
      yield r'page_name';
      yield serializers.serialize(
        object.pageName,
        specifiedType: const FullType(String),
      );
    }
    if (object.promoCode != null) {
      yield r'promo_code';
      yield serializers.serialize(
        object.promoCode,
        specifiedType: const FullType(String),
      );
    }
    if (object.property != null) {
      yield r'property';
      yield serializers.serialize(
        object.property,
        specifiedType: const FullType(String),
      );
    }
    if (object.searchQuery != null) {
      yield r'search_query';
      yield serializers.serialize(
        object.searchQuery,
        specifiedType: const FullType(String),
      );
    }
    if (object.value != null) {
      yield r'value';
      yield serializers.serialize(
        object.value,
        specifiedType: const FullType(String),
      );
    }
    if (object.videoTitle != null) {
      yield r'video_title';
      yield serializers.serialize(
        object.videoTitle,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    EventData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EventDataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Currency),
          ) as Currency;
          result.currency = valueDes;
          break;
        case r'lead_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.leadType = valueDes;
          break;
        case r'line_items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LineItem),
          ) as LineItem;
          result.lineItems.replace(valueDes);
          break;
        case r'order_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.orderId = valueDes;
          break;
        case r'order_quantity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.orderQuantity = valueDes;
          break;
        case r'page_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.pageName = valueDes;
          break;
        case r'promo_code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.promoCode = valueDes;
          break;
        case r'property':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.property = valueDes;
          break;
        case r'search_query':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.searchQuery = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.value = valueDes;
          break;
        case r'video_title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.videoTitle = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EventData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EventDataBuilder();
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

