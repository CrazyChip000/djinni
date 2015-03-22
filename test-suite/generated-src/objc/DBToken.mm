// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from token.djinni

#import "DBToken+Private.h"
#import "DBToken.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIDate.h"
#import "DJIError.h"
#include <exception>
#include <utility>
#include <vector>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface DBToken ()

@property (nonatomic, readonly) djinni::DbxCppWrapperCache<::Token>::Handle cppRef;

- (id)initWithCpp:(const std::shared_ptr<::Token>&)cppRef;

@end

namespace djinni_generated {

auto Token::toCpp(ObjcType objc) -> CppType
{
    return objc ? objc.cppRef.get() : nullptr;
}

auto Token::fromCpp(const CppType& cpp) -> ObjcType
{
    return !cpp ? nil : djinni::DbxCppWrapperCache<::Token>::getInstance()->get(cpp, [] (const auto& p)
    {
        return [[DBToken alloc] initWithCpp:p];
    });
}

}  // namespace djinni_generated

@implementation DBToken

- (id)initWithCpp:(const std::shared_ptr<::Token>&)cppRef
{
    if (self = [super init]) {
        _cppRef.assign(cppRef);
    }
    return self;
}

@end
