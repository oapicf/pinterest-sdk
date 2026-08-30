//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_ad_preview_delete200_response_inner_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_local_stores_delete200_response_inner.g.dart';

/// CatalogsLocalStoresDelete200ResponseInner
///
/// Properties:
/// * [id] - The ID of the local store.
/// * [status] 
@BuiltValue()
abstract class CatalogsLocalStoresDelete200ResponseInner implements Built<CatalogsLocalStoresDelete200ResponseInner, CatalogsLocalStoresDelete200ResponseInnerBuilder> {
  /// The ID of the local store.
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'status')
  CampaignAdPreviewDelete200ResponseInnerStatus get status;

  CatalogsLocalStoresDelete200ResponseInner._();

  factory CatalogsLocalStoresDelete200ResponseInner([void updates(CatalogsLocalStoresDelete200ResponseInnerBuilder b)]) = _$CatalogsLocalStoresDelete200ResponseInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsLocalStoresDelete200ResponseInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsLocalStoresDelete200ResponseInner> get serializer => _$CatalogsLocalStoresDelete200ResponseInnerSerializer();
}

class _$CatalogsLocalStoresDelete200ResponseInnerSerializer implements PrimitiveSerializer<CatalogsLocalStoresDelete200ResponseInner> {
  @override
  final Iterable<Type> types = const [CatalogsLocalStoresDelete200ResponseInner, _$CatalogsLocalStoresDelete200ResponseInner];

  @override
  final String wireName = r'CatalogsLocalStoresDelete200ResponseInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsLocalStoresDelete200ResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(CampaignAdPreviewDelete200ResponseInnerStatus),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsLocalStoresDelete200ResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsLocalStoresDelete200ResponseInnerBuilder result,
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
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CampaignAdPreviewDelete200ResponseInnerStatus),
          ) as CampaignAdPreviewDelete200ResponseInnerStatus;
          result.status.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsLocalStoresDelete200ResponseInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsLocalStoresDelete200ResponseInnerBuilder();
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

