//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/create_asset_access_request_body_asset_requests_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_asset_access_request_body.g.dart';

/// An object containing a list of all the asset access requests
///
/// Properties:
/// * [assetRequests] 
@BuiltValue()
abstract class CreateAssetAccessRequestBody implements Built<CreateAssetAccessRequestBody, CreateAssetAccessRequestBodyBuilder> {
  @BuiltValueField(wireName: r'asset_requests')
  BuiltList<CreateAssetAccessRequestBodyAssetRequestsInner> get assetRequests;

  CreateAssetAccessRequestBody._();

  factory CreateAssetAccessRequestBody([void updates(CreateAssetAccessRequestBodyBuilder b)]) = _$CreateAssetAccessRequestBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateAssetAccessRequestBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateAssetAccessRequestBody> get serializer => _$CreateAssetAccessRequestBodySerializer();
}

class _$CreateAssetAccessRequestBodySerializer implements PrimitiveSerializer<CreateAssetAccessRequestBody> {
  @override
  final Iterable<Type> types = const [CreateAssetAccessRequestBody, _$CreateAssetAccessRequestBody];

  @override
  final String wireName = r'CreateAssetAccessRequestBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateAssetAccessRequestBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'asset_requests';
    yield serializers.serialize(
      object.assetRequests,
      specifiedType: const FullType(BuiltList, [FullType(CreateAssetAccessRequestBodyAssetRequestsInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateAssetAccessRequestBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateAssetAccessRequestBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'asset_requests':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CreateAssetAccessRequestBodyAssetRequestsInner)]),
          ) as BuiltList<CreateAssetAccessRequestBodyAssetRequestsInner>;
          result.assetRequests.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateAssetAccessRequestBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateAssetAccessRequestBodyBuilder();
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

