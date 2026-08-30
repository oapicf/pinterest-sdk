//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/campaign_batch_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_batch_write_response_model.g.dart';

/// Response model for batch campaign write operations.
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class CampaignBatchWriteResponseModel implements Built<CampaignBatchWriteResponseModel, CampaignBatchWriteResponseModelBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<CampaignBatchItem> get items;

  CampaignBatchWriteResponseModel._();

  factory CampaignBatchWriteResponseModel([void updates(CampaignBatchWriteResponseModelBuilder b)]) = _$CampaignBatchWriteResponseModel;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignBatchWriteResponseModelBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignBatchWriteResponseModel> get serializer => _$CampaignBatchWriteResponseModelSerializer();
}

class _$CampaignBatchWriteResponseModelSerializer implements PrimitiveSerializer<CampaignBatchWriteResponseModel> {
  @override
  final Iterable<Type> types = const [CampaignBatchWriteResponseModel, _$CampaignBatchWriteResponseModel];

  @override
  final String wireName = r'CampaignBatchWriteResponseModel';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignBatchWriteResponseModel object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(CampaignBatchItem)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignBatchWriteResponseModel object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignBatchWriteResponseModelBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CampaignBatchItem)]),
          ) as BuiltList<CampaignBatchItem>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignBatchWriteResponseModel deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignBatchWriteResponseModelBuilder();
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

