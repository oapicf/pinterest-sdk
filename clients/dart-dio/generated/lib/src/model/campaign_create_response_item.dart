//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_create_response_data.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/exception.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_create_response_item.g.dart';

/// CampaignCreateResponseItem
///
/// Properties:
/// * [data] 
/// * [exceptions] 
@BuiltValue()
abstract class CampaignCreateResponseItem implements Built<CampaignCreateResponseItem, CampaignCreateResponseItemBuilder> {
  @BuiltValueField(wireName: r'data')
  CampaignCreateResponseData? get data;

  @BuiltValueField(wireName: r'exceptions')
  BuiltList<Exception>? get exceptions;

  CampaignCreateResponseItem._();

  factory CampaignCreateResponseItem([void updates(CampaignCreateResponseItemBuilder b)]) = _$CampaignCreateResponseItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignCreateResponseItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignCreateResponseItem> get serializer => _$CampaignCreateResponseItemSerializer();
}

class _$CampaignCreateResponseItemSerializer implements PrimitiveSerializer<CampaignCreateResponseItem> {
  @override
  final Iterable<Type> types = const [CampaignCreateResponseItem, _$CampaignCreateResponseItem];

  @override
  final String wireName = r'CampaignCreateResponseItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignCreateResponseItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(CampaignCreateResponseData),
      );
    }
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType(BuiltList, [FullType(Exception)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignCreateResponseItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignCreateResponseItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CampaignCreateResponseData),
          ) as CampaignCreateResponseData;
          result.data.replace(valueDes);
          break;
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(Exception)]),
          ) as BuiltList<Exception>;
          result.exceptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignCreateResponseItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignCreateResponseItemBuilder();
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

