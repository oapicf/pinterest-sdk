//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/operation_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'shared_audience_common.g.dart';

/// SharedAudienceCommon
///
/// Properties:
/// * [audienceId] - Unique identifier of an audience
/// * [operationType] 
@BuiltValue(instantiable: false)
abstract class SharedAudienceCommon  {
  /// Unique identifier of an audience
  @BuiltValueField(wireName: r'audience_id')
  String? get audienceId;

  @BuiltValueField(wireName: r'operation_type')
  OperationType? get operationType;
  // enum operationTypeEnum {  SHARE,  REVOKE,  };

  @BuiltValueSerializer(custom: true)
  static Serializer<SharedAudienceCommon> get serializer => _$SharedAudienceCommonSerializer();
}

class _$SharedAudienceCommonSerializer implements PrimitiveSerializer<SharedAudienceCommon> {
  @override
  final Iterable<Type> types = const [SharedAudienceCommon];

  @override
  final String wireName = r'SharedAudienceCommon';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SharedAudienceCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.audienceId != null) {
      yield r'audience_id';
      yield serializers.serialize(
        object.audienceId,
        specifiedType: const FullType(String),
      );
    }
    if (object.operationType != null) {
      yield r'operation_type';
      yield serializers.serialize(
        object.operationType,
        specifiedType: const FullType(OperationType),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    SharedAudienceCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  SharedAudienceCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($SharedAudienceCommon)) as $SharedAudienceCommon;
  }
}

/// a concrete implementation of [SharedAudienceCommon], since [SharedAudienceCommon] is not instantiable
@BuiltValue(instantiable: true)
abstract class $SharedAudienceCommon implements SharedAudienceCommon, Built<$SharedAudienceCommon, $SharedAudienceCommonBuilder> {
  $SharedAudienceCommon._();

  factory $SharedAudienceCommon([void Function($SharedAudienceCommonBuilder)? updates]) = _$$SharedAudienceCommon;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($SharedAudienceCommonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$SharedAudienceCommon> get serializer => _$$SharedAudienceCommonSerializer();
}

class _$$SharedAudienceCommonSerializer implements PrimitiveSerializer<$SharedAudienceCommon> {
  @override
  final Iterable<Type> types = const [$SharedAudienceCommon, _$$SharedAudienceCommon];

  @override
  final String wireName = r'$SharedAudienceCommon';

  @override
  Object serialize(
    Serializers serializers,
    $SharedAudienceCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(SharedAudienceCommon))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SharedAudienceCommonBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'audience_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.audienceId = valueDes;
          break;
        case r'operation_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OperationType),
          ) as OperationType;
          result.operationType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $SharedAudienceCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $SharedAudienceCommonBuilder();
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

