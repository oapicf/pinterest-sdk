//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_create_response_item.dart';
import 'package:openapi/src/model/campaign_create_response.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_update_response.g.dart';

/// CampaignUpdateResponse
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class CampaignUpdateResponse implements CampaignCreateResponse, Built<CampaignUpdateResponse, CampaignUpdateResponseBuilder> {
  CampaignUpdateResponse._();

  factory CampaignUpdateResponse([void updates(CampaignUpdateResponseBuilder b)]) = _$CampaignUpdateResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignUpdateResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignUpdateResponse> get serializer => _$CampaignUpdateResponseSerializer();
}

class _$CampaignUpdateResponseSerializer implements PrimitiveSerializer<CampaignUpdateResponse> {
  @override
  final Iterable<Type> types = const [CampaignUpdateResponse, _$CampaignUpdateResponse];

  @override
  final String wireName = r'CampaignUpdateResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignUpdateResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(CampaignCreateResponseItem)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignUpdateResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignUpdateResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CampaignCreateResponseItem)]),
          ) as BuiltList<CampaignCreateResponseItem>;
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
  CampaignUpdateResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignUpdateResponseBuilder();
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

