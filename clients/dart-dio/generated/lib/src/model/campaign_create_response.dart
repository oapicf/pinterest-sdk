//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_create_response_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_create_response.g.dart';

/// CampaignCreateResponse
///
/// Properties:
/// * [items] 
@BuiltValue(instantiable: false)
abstract class CampaignCreateResponse  {
  @BuiltValueField(wireName: r'items')
  BuiltList<CampaignCreateResponseItem>? get items;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignCreateResponse> get serializer => _$CampaignCreateResponseSerializer();
}

class _$CampaignCreateResponseSerializer implements PrimitiveSerializer<CampaignCreateResponse> {
  @override
  final Iterable<Type> types = const [CampaignCreateResponse];

  @override
  final String wireName = r'CampaignCreateResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignCreateResponse object, {
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
    CampaignCreateResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  CampaignCreateResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($CampaignCreateResponse)) as $CampaignCreateResponse;
  }
}

/// a concrete implementation of [CampaignCreateResponse], since [CampaignCreateResponse] is not instantiable
@BuiltValue(instantiable: true)
abstract class $CampaignCreateResponse implements CampaignCreateResponse, Built<$CampaignCreateResponse, $CampaignCreateResponseBuilder> {
  $CampaignCreateResponse._();

  factory $CampaignCreateResponse([void Function($CampaignCreateResponseBuilder)? updates]) = _$$CampaignCreateResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($CampaignCreateResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$CampaignCreateResponse> get serializer => _$$CampaignCreateResponseSerializer();
}

class _$$CampaignCreateResponseSerializer implements PrimitiveSerializer<$CampaignCreateResponse> {
  @override
  final Iterable<Type> types = const [$CampaignCreateResponse, _$$CampaignCreateResponse];

  @override
  final String wireName = r'$CampaignCreateResponse';

  @override
  Object serialize(
    Serializers serializers,
    $CampaignCreateResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(CampaignCreateResponse))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignCreateResponseBuilder result,
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
  $CampaignCreateResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $CampaignCreateResponseBuilder();
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

