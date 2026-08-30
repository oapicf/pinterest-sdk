//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/conversion_deletion_request_targets.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_deletion_request_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [deletionTargets] - Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
@BuiltValue()
abstract class ConversionDeletionRequestCreate implements Built<ConversionDeletionRequestCreate, ConversionDeletionRequestCreateBuilder> {
  /// Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
  @BuiltValueField(wireName: r'deletion_targets')
  ConversionDeletionRequestTargets get deletionTargets;

  ConversionDeletionRequestCreate._();

  factory ConversionDeletionRequestCreate([void updates(ConversionDeletionRequestCreateBuilder b)]) = _$ConversionDeletionRequestCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionDeletionRequestCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionDeletionRequestCreate> get serializer => _$ConversionDeletionRequestCreateSerializer();
}

class _$ConversionDeletionRequestCreateSerializer implements PrimitiveSerializer<ConversionDeletionRequestCreate> {
  @override
  final Iterable<Type> types = const [ConversionDeletionRequestCreate, _$ConversionDeletionRequestCreate];

  @override
  final String wireName = r'ConversionDeletionRequestCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionDeletionRequestCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'deletion_targets';
    yield serializers.serialize(
      object.deletionTargets,
      specifiedType: const FullType(ConversionDeletionRequestTargets),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionDeletionRequestCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionDeletionRequestCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'deletion_targets':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionDeletionRequestTargets),
          ) as ConversionDeletionRequestTargets;
          result.deletionTargets.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionDeletionRequestCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionDeletionRequestCreateBuilder();
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

