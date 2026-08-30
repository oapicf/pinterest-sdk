//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_ad_preview_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [adGroupId] - Ad group ID to create a preview record for.
@BuiltValue()
abstract class CampaignAdPreviewCreate implements Built<CampaignAdPreviewCreate, CampaignAdPreviewCreateBuilder> {
  /// Ad group ID to create a preview record for.
  @BuiltValueField(wireName: r'ad_group_id')
  String get adGroupId;

  CampaignAdPreviewCreate._();

  factory CampaignAdPreviewCreate([void updates(CampaignAdPreviewCreateBuilder b)]) = _$CampaignAdPreviewCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignAdPreviewCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignAdPreviewCreate> get serializer => _$CampaignAdPreviewCreateSerializer();
}

class _$CampaignAdPreviewCreateSerializer implements PrimitiveSerializer<CampaignAdPreviewCreate> {
  @override
  final Iterable<Type> types = const [CampaignAdPreviewCreate, _$CampaignAdPreviewCreate];

  @override
  final String wireName = r'CampaignAdPreviewCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignAdPreviewCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'ad_group_id';
    yield serializers.serialize(
      object.adGroupId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignAdPreviewCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignAdPreviewCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_group_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adGroupId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignAdPreviewCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignAdPreviewCreateBuilder();
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

