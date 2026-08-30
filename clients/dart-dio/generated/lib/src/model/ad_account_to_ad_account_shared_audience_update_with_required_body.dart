//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/operation_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_account_to_ad_account_shared_audience_update_with_required_body.g.dart';

/// Resource create or update operation model with required body fields (no OptionalProperties).
///
/// Properties:
/// * [audienceId] - Unique identifier of an audience
/// * [operationType] 
/// * [recipientAccountIds] - Ad account IDs to share with or revoke from (request) / that received the audience (response).
@BuiltValue()
abstract class AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody implements Built<AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody, AdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyBuilder> {
  /// Unique identifier of an audience
  @BuiltValueField(wireName: r'audience_id')
  String get audienceId;

  @BuiltValueField(wireName: r'operation_type')
  OperationType get operationType;
  // enum operationTypeEnum {  SHARE,  REVOKE,  };

  /// Ad account IDs to share with or revoke from (request) / that received the audience (response).
  @BuiltValueField(wireName: r'recipient_account_ids')
  BuiltList<String> get recipientAccountIds;

  AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody._();

  factory AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody([void updates(AdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyBuilder b)]) = _$AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody> get serializer => _$AdAccountToAdAccountSharedAudienceUpdateWithRequiredBodySerializer();
}

class _$AdAccountToAdAccountSharedAudienceUpdateWithRequiredBodySerializer implements PrimitiveSerializer<AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody> {
  @override
  final Iterable<Type> types = const [AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody, _$AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody];

  @override
  final String wireName = r'AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'audience_id';
    yield serializers.serialize(
      object.audienceId,
      specifiedType: const FullType(String),
    );
    yield r'operation_type';
    yield serializers.serialize(
      object.operationType,
      specifiedType: const FullType(OperationType),
    );
    yield r'recipient_account_ids';
    yield serializers.serialize(
      object.recipientAccountIds,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'audience_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.audienceId = valueDes;
          break;
        case r'operation_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OperationType),
          ) as OperationType;
          result.operationType = valueDes;
          break;
        case r'recipient_account_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.recipientAccountIds.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyBuilder();
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

