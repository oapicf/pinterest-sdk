//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_deletion_request_epik_targets.g.dart';

/// ConversionDeletionRequestEPIKTargets
///
/// Properties:
/// * [epiks] - Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
@BuiltValue()
abstract class ConversionDeletionRequestEPIKTargets implements Built<ConversionDeletionRequestEPIKTargets, ConversionDeletionRequestEPIKTargetsBuilder> {
  /// Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
  @BuiltValueField(wireName: r'epiks')
  BuiltList<String> get epiks;

  ConversionDeletionRequestEPIKTargets._();

  factory ConversionDeletionRequestEPIKTargets([void updates(ConversionDeletionRequestEPIKTargetsBuilder b)]) = _$ConversionDeletionRequestEPIKTargets;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionDeletionRequestEPIKTargetsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionDeletionRequestEPIKTargets> get serializer => _$ConversionDeletionRequestEPIKTargetsSerializer();
}

class _$ConversionDeletionRequestEPIKTargetsSerializer implements PrimitiveSerializer<ConversionDeletionRequestEPIKTargets> {
  @override
  final Iterable<Type> types = const [ConversionDeletionRequestEPIKTargets, _$ConversionDeletionRequestEPIKTargets];

  @override
  final String wireName = r'ConversionDeletionRequestEPIKTargets';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionDeletionRequestEPIKTargets object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'epiks';
    yield serializers.serialize(
      object.epiks,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionDeletionRequestEPIKTargets object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionDeletionRequestEPIKTargetsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'epiks':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.epiks.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionDeletionRequestEPIKTargets deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionDeletionRequestEPIKTargetsBuilder();
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

