//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ineligible_product_tag_reason.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ineligible_product_tag_error_item.g.dart';

/// Error item for a product tag that failed eligibility check.
///
/// Properties:
/// * [errorMessage] - Reason why the pin is ineligible for tagging.
/// * [pinId] - Pin ID that failed eligibility check.
@BuiltValue()
abstract class IneligibleProductTagErrorItem implements Built<IneligibleProductTagErrorItem, IneligibleProductTagErrorItemBuilder> {
  /// Reason why the pin is ineligible for tagging.
  @BuiltValueField(wireName: r'error_message')
  IneligibleProductTagReason get errorMessage;
  // enum errorMessageEnum {  PIN_MISSING,  PIN_IS_PRIVATE,  PRODUCT_METADATA_MISSING,  PIN_NOT_FROM_VERIFIED_DOMAIN,  PIN_NOT_FROM_SAME_USER_AS_HERO_PIN,  };

  /// Pin ID that failed eligibility check.
  @BuiltValueField(wireName: r'pin_id')
  String get pinId;

  IneligibleProductTagErrorItem._();

  factory IneligibleProductTagErrorItem([void updates(IneligibleProductTagErrorItemBuilder b)]) = _$IneligibleProductTagErrorItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IneligibleProductTagErrorItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IneligibleProductTagErrorItem> get serializer => _$IneligibleProductTagErrorItemSerializer();
}

class _$IneligibleProductTagErrorItemSerializer implements PrimitiveSerializer<IneligibleProductTagErrorItem> {
  @override
  final Iterable<Type> types = const [IneligibleProductTagErrorItem, _$IneligibleProductTagErrorItem];

  @override
  final String wireName = r'IneligibleProductTagErrorItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IneligibleProductTagErrorItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'error_message';
    yield serializers.serialize(
      object.errorMessage,
      specifiedType: const FullType(IneligibleProductTagReason),
    );
    yield r'pin_id';
    yield serializers.serialize(
      object.pinId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    IneligibleProductTagErrorItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required IneligibleProductTagErrorItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'error_message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(IneligibleProductTagReason),
          ) as IneligibleProductTagReason;
          result.errorMessage = valueDes;
          break;
        case r'pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.pinId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  IneligibleProductTagErrorItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IneligibleProductTagErrorItemBuilder();
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

