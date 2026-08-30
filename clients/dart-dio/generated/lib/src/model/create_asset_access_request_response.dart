//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/asset_access_request_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_asset_access_request_response.g.dart';

/// CreateAssetAccessRequestResponse
///
/// Properties:
/// * [exceptions] - A list of errors associated with the asset access requests. Will be returned if there is an error.
/// * [invites] - An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
@BuiltValue()
abstract class CreateAssetAccessRequestResponse implements Built<CreateAssetAccessRequestResponse, CreateAssetAccessRequestResponseBuilder> {
  /// A list of errors associated with the asset access requests. Will be returned if there is an error.
  @BuiltValueField(wireName: r'exceptions')
  BuiltList<AssetAccessRequestError>? get exceptions;

  /// An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
  @BuiltValueField(wireName: r'invites')
  BuiltMap<String, String>? get invites;

  CreateAssetAccessRequestResponse._();

  factory CreateAssetAccessRequestResponse([void updates(CreateAssetAccessRequestResponseBuilder b)]) = _$CreateAssetAccessRequestResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateAssetAccessRequestResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateAssetAccessRequestResponse> get serializer => _$CreateAssetAccessRequestResponseSerializer();
}

class _$CreateAssetAccessRequestResponseSerializer implements PrimitiveSerializer<CreateAssetAccessRequestResponse> {
  @override
  final Iterable<Type> types = const [CreateAssetAccessRequestResponse, _$CreateAssetAccessRequestResponse];

  @override
  final String wireName = r'CreateAssetAccessRequestResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateAssetAccessRequestResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType(BuiltList, [FullType(AssetAccessRequestError)]),
      );
    }
    if (object.invites != null) {
      yield r'invites';
      yield serializers.serialize(
        object.invites,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateAssetAccessRequestResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateAssetAccessRequestResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AssetAccessRequestError)]),
          ) as BuiltList<AssetAccessRequestError>?;
          if (valueDes == null) continue;
          result.exceptions.replace(valueDes);
          break;
        case r'invites':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(String)]),
          ) as BuiltMap<String, String>?;
          if (valueDes == null) continue;
          result.invites.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateAssetAccessRequestResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateAssetAccessRequestResponseBuilder();
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

