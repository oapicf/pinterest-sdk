//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'account.g.dart';

/// Account
///
/// Properties:
/// * [about] - Profile about description.
/// * [accountType] - Type of account
/// * [boardCount] - User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
/// * [businessName] 
/// * [followerCount] - User account follower count.
/// * [followingCount] - User account following count.
/// * [id] - User account ID.
/// * [monthlyViews] - User account monthly views.
/// * [pinCount] - User account pin count. This includes both created and saved pins.
/// * [profileImage] 
/// * [username] 
/// * [websiteUrl] 
@BuiltValue()
abstract class Account implements Built<Account, AccountBuilder> {
  /// Profile about description.
  @BuiltValueField(wireName: r'about')
  String? get about;

  /// Type of account
  @BuiltValueField(wireName: r'account_type')
  AccountAccountTypeEnum? get accountType;
  // enum accountTypeEnum {  PINNER,  BUSINESS,  };

  /// User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
  @BuiltValueField(wireName: r'board_count')
  int? get boardCount;

  @BuiltValueField(wireName: r'business_name')
  String? get businessName;

  /// User account follower count.
  @BuiltValueField(wireName: r'follower_count')
  int? get followerCount;

  /// User account following count.
  @BuiltValueField(wireName: r'following_count')
  int? get followingCount;

  /// User account ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// User account monthly views.
  @BuiltValueField(wireName: r'monthly_views')
  int? get monthlyViews;

  /// User account pin count. This includes both created and saved pins.
  @BuiltValueField(wireName: r'pin_count')
  int? get pinCount;

  @BuiltValueField(wireName: r'profile_image')
  String? get profileImage;

  @BuiltValueField(wireName: r'username')
  String? get username;

  @BuiltValueField(wireName: r'website_url')
  String? get websiteUrl;

  Account._();

  factory Account([void updates(AccountBuilder b)]) = _$Account;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AccountBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Account> get serializer => _$AccountSerializer();
}

class _$AccountSerializer implements PrimitiveSerializer<Account> {
  @override
  final Iterable<Type> types = const [Account, _$Account];

  @override
  final String wireName = r'Account';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Account object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.about != null) {
      yield r'about';
      yield serializers.serialize(
        object.about,
        specifiedType: const FullType(String),
      );
    }
    if (object.accountType != null) {
      yield r'account_type';
      yield serializers.serialize(
        object.accountType,
        specifiedType: const FullType(AccountAccountTypeEnum),
      );
    }
    if (object.boardCount != null) {
      yield r'board_count';
      yield serializers.serialize(
        object.boardCount,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.businessName != null) {
      yield r'business_name';
      yield serializers.serialize(
        object.businessName,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.followerCount != null) {
      yield r'follower_count';
      yield serializers.serialize(
        object.followerCount,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.followingCount != null) {
      yield r'following_count';
      yield serializers.serialize(
        object.followingCount,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.monthlyViews != null) {
      yield r'monthly_views';
      yield serializers.serialize(
        object.monthlyViews,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.pinCount != null) {
      yield r'pin_count';
      yield serializers.serialize(
        object.pinCount,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.profileImage != null) {
      yield r'profile_image';
      yield serializers.serialize(
        object.profileImage,
        specifiedType: const FullType(String),
      );
    }
    if (object.username != null) {
      yield r'username';
      yield serializers.serialize(
        object.username,
        specifiedType: const FullType(String),
      );
    }
    if (object.websiteUrl != null) {
      yield r'website_url';
      yield serializers.serialize(
        object.websiteUrl,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Account object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AccountBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'about':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.about = valueDes;
          break;
        case r'account_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AccountAccountTypeEnum),
          ) as AccountAccountTypeEnum;
          result.accountType = valueDes;
          break;
        case r'board_count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.boardCount = valueDes;
          break;
        case r'business_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.businessName = valueDes;
          break;
        case r'follower_count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.followerCount = valueDes;
          break;
        case r'following_count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.followingCount = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'monthly_views':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.monthlyViews = valueDes;
          break;
        case r'pin_count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.pinCount = valueDes;
          break;
        case r'profile_image':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.profileImage = valueDes;
          break;
        case r'username':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.username = valueDes;
          break;
        case r'website_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.websiteUrl = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Account deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AccountBuilder();
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

class AccountAccountTypeEnum extends EnumClass {

  /// Type of account
  @BuiltValueEnumConst(wireName: r'PINNER')
  static const AccountAccountTypeEnum PINNER = _$accountAccountTypeEnum_PINNER;
  /// Type of account
  @BuiltValueEnumConst(wireName: r'BUSINESS')
  static const AccountAccountTypeEnum BUSINESS = _$accountAccountTypeEnum_BUSINESS;

  static Serializer<AccountAccountTypeEnum> get serializer => _$accountAccountTypeEnumSerializer;

  const AccountAccountTypeEnum._(String name): super(name);

  static BuiltSet<AccountAccountTypeEnum> get values => _$accountAccountTypeEnumValues;
  static AccountAccountTypeEnum valueOf(String name) => _$accountAccountTypeEnumValueOf(name);
}

