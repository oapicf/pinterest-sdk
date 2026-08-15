//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audience_rule.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_common.g.dart';

/// AudienceCommon
///
/// Properties:
/// * [adAccountId] - Ad account ID.
/// * [name] - Audience name.
/// * [rule] 
@BuiltValue(instantiable: false)
abstract class AudienceCommon  {
  /// Ad account ID.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// Audience name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'rule')
  AudienceRule? get rule;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudienceCommon> get serializer => _$AudienceCommonSerializer();
}

class _$AudienceCommonSerializer implements PrimitiveSerializer<AudienceCommon> {
  @override
  final Iterable<Type> types = const [AudienceCommon];

  @override
  final String wireName = r'AudienceCommon';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudienceCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.rule != null) {
      yield r'rule';
      yield serializers.serialize(
        object.rule,
        specifiedType: const FullType(AudienceRule),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AudienceCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  AudienceCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($AudienceCommon)) as $AudienceCommon;
  }
}

/// a concrete implementation of [AudienceCommon], since [AudienceCommon] is not instantiable
@BuiltValue(instantiable: true)
abstract class $AudienceCommon implements AudienceCommon, Built<$AudienceCommon, $AudienceCommonBuilder> {
  $AudienceCommon._();

  factory $AudienceCommon([void Function($AudienceCommonBuilder)? updates]) = _$$AudienceCommon;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($AudienceCommonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$AudienceCommon> get serializer => _$$AudienceCommonSerializer();
}

class _$$AudienceCommonSerializer implements PrimitiveSerializer<$AudienceCommon> {
  @override
  final Iterable<Type> types = const [$AudienceCommon, _$$AudienceCommon];

  @override
  final String wireName = r'$AudienceCommon';

  @override
  Object serialize(
    Serializers serializers,
    $AudienceCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(AudienceCommon))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceCommonBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'rule':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AudienceRule),
          ) as AudienceRule;
          result.rule.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $AudienceCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $AudienceCommonBuilder();
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

