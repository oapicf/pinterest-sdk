//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'partner_metadata.g.dart';

/// PartnerMetadata
///
/// Properties:
/// * [subscriberKey] - Text field value that uniquely identifies a subscriber.
@BuiltValue()
abstract class PartnerMetadata implements Built<PartnerMetadata, PartnerMetadataBuilder> {
  /// Text field value that uniquely identifies a subscriber.
  @BuiltValueField(wireName: r'subscriber_key')
  String? get subscriberKey;

  PartnerMetadata._();

  factory PartnerMetadata([void updates(PartnerMetadataBuilder b)]) = _$PartnerMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PartnerMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PartnerMetadata> get serializer => _$PartnerMetadataSerializer();
}

class _$PartnerMetadataSerializer implements PrimitiveSerializer<PartnerMetadata> {
  @override
  final Iterable<Type> types = const [PartnerMetadata, _$PartnerMetadata];

  @override
  final String wireName = r'PartnerMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PartnerMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.subscriberKey != null) {
      yield r'subscriber_key';
      yield serializers.serialize(
        object.subscriberKey,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PartnerMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PartnerMetadataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'subscriber_key':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.subscriberKey = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PartnerMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PartnerMetadataBuilder();
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

