//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audience_account_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'shared_audience_account.g.dart';

/// SharedAudienceAccount
///
/// Properties:
/// * [accountId] - Account ID (ad account or business ID).
/// * [accountName] - Account name.
/// * [accountType] - account type
/// * [sharedOnTimestamp] - Epoch timestamp in seconds for the shared audience event
@BuiltValue()
abstract class SharedAudienceAccount implements Built<SharedAudienceAccount, SharedAudienceAccountBuilder> {
  /// Account ID (ad account or business ID).
  @BuiltValueField(wireName: r'account_id')
  String get accountId;

  /// Account name.
  @BuiltValueField(wireName: r'account_name')
  String get accountName;

  /// account type
  @BuiltValueField(wireName: r'account_type')
  AudienceAccountType get accountType;
  // enum accountTypeEnum {  AD_ACCOUNT,  BUSINESS_ACCOUNT,  };

  /// Epoch timestamp in seconds for the shared audience event
  @BuiltValueField(wireName: r'shared_on_timestamp')
  int get sharedOnTimestamp;

  SharedAudienceAccount._();

  factory SharedAudienceAccount([void updates(SharedAudienceAccountBuilder b)]) = _$SharedAudienceAccount;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SharedAudienceAccountBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SharedAudienceAccount> get serializer => _$SharedAudienceAccountSerializer();
}

class _$SharedAudienceAccountSerializer implements PrimitiveSerializer<SharedAudienceAccount> {
  @override
  final Iterable<Type> types = const [SharedAudienceAccount, _$SharedAudienceAccount];

  @override
  final String wireName = r'SharedAudienceAccount';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SharedAudienceAccount object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'account_id';
    yield serializers.serialize(
      object.accountId,
      specifiedType: const FullType(String),
    );
    yield r'account_name';
    yield serializers.serialize(
      object.accountName,
      specifiedType: const FullType(String),
    );
    yield r'account_type';
    yield serializers.serialize(
      object.accountType,
      specifiedType: const FullType(AudienceAccountType),
    );
    yield r'shared_on_timestamp';
    yield serializers.serialize(
      object.sharedOnTimestamp,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    SharedAudienceAccount object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SharedAudienceAccountBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.accountId = valueDes;
          break;
        case r'account_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.accountName = valueDes;
          break;
        case r'account_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AudienceAccountType),
          ) as AudienceAccountType;
          result.accountType = valueDes;
          break;
        case r'shared_on_timestamp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.sharedOnTimestamp = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SharedAudienceAccount deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SharedAudienceAccountBuilder();
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

