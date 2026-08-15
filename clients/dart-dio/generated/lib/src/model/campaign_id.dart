//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_id.g.dart';

/// CampaignId
///
/// Properties:
/// * [id] - Campaign ID.
@BuiltValue(instantiable: false)
abstract class CampaignId  {
  /// Campaign ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignId> get serializer => _$CampaignIdSerializer();
}

class _$CampaignIdSerializer implements PrimitiveSerializer<CampaignId> {
  @override
  final Iterable<Type> types = const [CampaignId];

  @override
  final String wireName = r'CampaignId';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignId object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignId object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  CampaignId deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($CampaignId)) as $CampaignId;
  }
}

/// a concrete implementation of [CampaignId], since [CampaignId] is not instantiable
@BuiltValue(instantiable: true)
abstract class $CampaignId implements CampaignId, Built<$CampaignId, $CampaignIdBuilder> {
  $CampaignId._();

  factory $CampaignId([void Function($CampaignIdBuilder)? updates]) = _$$CampaignId;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($CampaignIdBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$CampaignId> get serializer => _$$CampaignIdSerializer();
}

class _$$CampaignIdSerializer implements PrimitiveSerializer<$CampaignId> {
  @override
  final Iterable<Type> types = const [$CampaignId, _$$CampaignId];

  @override
  final String wireName = r'$CampaignId';

  @override
  Object serialize(
    Serializers serializers,
    $CampaignId object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(CampaignId))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignIdBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $CampaignId deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $CampaignIdBuilder();
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

