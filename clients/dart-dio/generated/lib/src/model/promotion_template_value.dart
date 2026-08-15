//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/currency.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'promotion_template_value.g.dart';

/// PromotionTemplateValue
///
/// Properties:
/// * [amount] - Numeric value.
/// * [currencyCode] 
/// * [customText] - Custom text.
/// * [percent] - Percent value.
@BuiltValue()
abstract class PromotionTemplateValue implements Built<PromotionTemplateValue, PromotionTemplateValueBuilder> {
  /// Numeric value.
  @BuiltValueField(wireName: r'amount')
  num? get amount;

  @BuiltValueField(wireName: r'currency_code')
  Currency? get currencyCode;
  // enum currencyCodeEnum {  UNK,  USD,  GBP,  CAD,  EUR,  AUD,  NZD,  SEK,  ILS,  CHF,  HKD,  JPY,  SGD,  KRW,  NOK,  DKK,  PLN,  RON,  HUF,  CZK,  BRL,  MXN,  ARS,  CLP,  COP,  INR,  TRY,  };

  /// Custom text.
  @BuiltValueField(wireName: r'custom_text')
  String? get customText;

  /// Percent value.
  @BuiltValueField(wireName: r'percent')
  num? get percent;

  PromotionTemplateValue._();

  factory PromotionTemplateValue([void updates(PromotionTemplateValueBuilder b)]) = _$PromotionTemplateValue;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PromotionTemplateValueBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PromotionTemplateValue> get serializer => _$PromotionTemplateValueSerializer();
}

class _$PromotionTemplateValueSerializer implements PrimitiveSerializer<PromotionTemplateValue> {
  @override
  final Iterable<Type> types = const [PromotionTemplateValue, _$PromotionTemplateValue];

  @override
  final String wireName = r'PromotionTemplateValue';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PromotionTemplateValue object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.amount != null) {
      yield r'amount';
      yield serializers.serialize(
        object.amount,
        specifiedType: const FullType(num),
      );
    }
    if (object.currencyCode != null) {
      yield r'currency_code';
      yield serializers.serialize(
        object.currencyCode,
        specifiedType: const FullType(Currency),
      );
    }
    if (object.customText != null) {
      yield r'custom_text';
      yield serializers.serialize(
        object.customText,
        specifiedType: const FullType(String),
      );
    }
    if (object.percent != null) {
      yield r'percent';
      yield serializers.serialize(
        object.percent,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PromotionTemplateValue object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PromotionTemplateValueBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'amount':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.amount = valueDes;
          break;
        case r'currency_code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Currency),
          ) as Currency;
          result.currencyCode = valueDes;
          break;
        case r'custom_text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.customText = valueDes;
          break;
        case r'percent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.percent = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PromotionTemplateValue deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PromotionTemplateValueBuilder();
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

