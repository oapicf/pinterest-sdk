//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/role.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'shared_audience_response_common.g.dart';

/// SharedAudienceResponseCommon
///
/// Properties:
/// * [audienceId] - Audience ID that was shared
/// * [permissions] 
@BuiltValue(instantiable: false)
abstract class SharedAudienceResponseCommon  {
  /// Audience ID that was shared
  @BuiltValueField(wireName: r'audience_id')
  String? get audienceId;

  @BuiltValueField(wireName: r'permissions')
  BuiltList<Role>? get permissions;

  @BuiltValueSerializer(custom: true)
  static Serializer<SharedAudienceResponseCommon> get serializer => _$SharedAudienceResponseCommonSerializer();
}

class _$SharedAudienceResponseCommonSerializer implements PrimitiveSerializer<SharedAudienceResponseCommon> {
  @override
  final Iterable<Type> types = const [SharedAudienceResponseCommon];

  @override
  final String wireName = r'SharedAudienceResponseCommon';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SharedAudienceResponseCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.audienceId != null) {
      yield r'audience_id';
      yield serializers.serialize(
        object.audienceId,
        specifiedType: const FullType(String),
      );
    }
    if (object.permissions != null) {
      yield r'permissions';
      yield serializers.serialize(
        object.permissions,
        specifiedType: const FullType(BuiltList, [FullType(Role)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    SharedAudienceResponseCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  SharedAudienceResponseCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($SharedAudienceResponseCommon)) as $SharedAudienceResponseCommon;
  }
}

/// a concrete implementation of [SharedAudienceResponseCommon], since [SharedAudienceResponseCommon] is not instantiable
@BuiltValue(instantiable: true)
abstract class $SharedAudienceResponseCommon implements SharedAudienceResponseCommon, Built<$SharedAudienceResponseCommon, $SharedAudienceResponseCommonBuilder> {
  $SharedAudienceResponseCommon._();

  factory $SharedAudienceResponseCommon([void Function($SharedAudienceResponseCommonBuilder)? updates]) = _$$SharedAudienceResponseCommon;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($SharedAudienceResponseCommonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$SharedAudienceResponseCommon> get serializer => _$$SharedAudienceResponseCommonSerializer();
}

class _$$SharedAudienceResponseCommonSerializer implements PrimitiveSerializer<$SharedAudienceResponseCommon> {
  @override
  final Iterable<Type> types = const [$SharedAudienceResponseCommon, _$$SharedAudienceResponseCommon];

  @override
  final String wireName = r'$SharedAudienceResponseCommon';

  @override
  Object serialize(
    Serializers serializers,
    $SharedAudienceResponseCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(SharedAudienceResponseCommon))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SharedAudienceResponseCommonBuilder result,
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
        case r'permissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(Role)]),
          ) as BuiltList<Role>;
          result.permissions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $SharedAudienceResponseCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $SharedAudienceResponseCommonBuilder();
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

