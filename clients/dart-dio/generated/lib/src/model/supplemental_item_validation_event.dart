//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'supplemental_item_validation_event.g.dart';

/// Item validation event
///
/// Properties:
/// * [attribute] - The item attribute referenced by the validation event eg. price, availability, ad_link
/// * [code] - The event code that the item validation event references
/// * [message] - Title message describing the item validation event
@BuiltValue()
abstract class SupplementalItemValidationEvent implements Built<SupplementalItemValidationEvent, SupplementalItemValidationEventBuilder> {
  /// The item attribute referenced by the validation event eg. price, availability, ad_link
  @BuiltValueField(wireName: r'attribute')
  String get attribute;

  /// The event code that the item validation event references
  @BuiltValueField(wireName: r'code')
  int get code;

  /// Title message describing the item validation event
  @BuiltValueField(wireName: r'message')
  String get message;

  SupplementalItemValidationEvent._();

  factory SupplementalItemValidationEvent([void updates(SupplementalItemValidationEventBuilder b)]) = _$SupplementalItemValidationEvent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SupplementalItemValidationEventBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SupplementalItemValidationEvent> get serializer => _$SupplementalItemValidationEventSerializer();
}

class _$SupplementalItemValidationEventSerializer implements PrimitiveSerializer<SupplementalItemValidationEvent> {
  @override
  final Iterable<Type> types = const [SupplementalItemValidationEvent, _$SupplementalItemValidationEvent];

  @override
  final String wireName = r'SupplementalItemValidationEvent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SupplementalItemValidationEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'attribute';
    yield serializers.serialize(
      object.attribute,
      specifiedType: const FullType(String),
    );
    yield r'code';
    yield serializers.serialize(
      object.code,
      specifiedType: const FullType(int),
    );
    yield r'message';
    yield serializers.serialize(
      object.message,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    SupplementalItemValidationEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SupplementalItemValidationEventBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attribute':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.attribute = valueDes;
          break;
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.code = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SupplementalItemValidationEvent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SupplementalItemValidationEventBuilder();
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

